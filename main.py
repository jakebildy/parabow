#Developed by Jake Bildy, 2018

import requests
import RPi.GPIO as GPIO
import time 
import os
import Bluetooth

server_socket=bluetooth.BluetoothSocket(bluetooth.RFCOMM)

port = 1
server_socket.listen(1)

client_socket,address = server_socket.accept()
print ("Connected to " + address + " lmaoo")

while 1:
	data = client_socket.recv(1024)
	if data == "fire" :
		os.system("omxplayer -o local firing.wav")
	
client_socket.close()
server_socket.close() 




