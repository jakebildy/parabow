#Jake Bildy, 2018
#Including functions from Google's python streaming demo

import os, wave, io
import pyaudio
from google.cloud import speech
from six.moves import queue


#Default audio recording params
RATE = 16000
CHUNK = int(RATE/10)


class ProcessAudio(object):

    def __init__(self):
        print("ProcessAudio.py: AYY it's lit server-side")

    def __enter__(self):
        self._audio_interface = pyaudio.PyAudio()
        self._audio_stream = self._audio_interface.open(
            format=pyaudio.paInt16, channels=1, rate=self._rate, Input=True,
            frames_per_buffer=self._chunk, stream_callback=self._fill_buffer,
        )
        self.closed = False

        return self

    def __exit__(self, type, value, traceback):
        self._audio_stream.stop_stream()
        self._audio_stream.close()
        self.closed = True
        # Signal the generator to terminate so that the client's
        # streaming_recognize method will not block the process termination.
        self._buff.put(None)
        self._audio_interface.terminate()

    def _fill_buffer(self, in_data, frame_count, time_info, status_flags):
        """Continuously collect data from the audio stream, into the buffer."""
        self._buff.put(in_data)
        return None, pyaudio.paContinue

    def generator(self):
        while not self.closed:
            # Use a blocking get() to ensure there's at least one chunk of
            # data, and stop iteration if the chunk is None, indicating the
            # end of the audio stream.
            chunk = self._buff.get()
            if chunk is None:
                return
            data = [chunk]

            # Now consume whatever other data's still buffered.
            while True:
                try:
                    chunk = self._buff.get(block=False)
                    if chunk is None:
                        return
                    data.append(chunk)
                except queue.Empty:
                    break

            yield b''.join(data)

# [END audio_stream]

    def listen_and_print(self):
        return
    
    #Checks if keyword has been said
    def activation_said(self, text, keyword):
        if (keyword in text) :
            return True
        else :
            return False

