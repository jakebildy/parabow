#Developed by Jake Bildy, 2018


import RPi.GPIO as GPIO
import time 
import os
import bluetooth

server_socket = BluetoothSocket( RFCOMM )
server_socket.bind(("",PORT_ANY))
server_socket.listen(1)

uuid = "94f39d29-7d6d-437d-973b-fba39e49d4ee"

advertise_service( server_socket, "ParabowServer",
                   service_id = uuid,
                   service_classes = [ uuid, SERIAL_PORT_CLASS ],
                   profiles = [ SERIAL_PORT_PROFILE ]
                    )

client_socket,address = server_socket.accept()
print ("Connected to " + address + " lmaoo")

while 1:
	data = client_socket.recv(1024)
	if data == "fire" :
		os.system("omxplayer -o local firing.wav")
	
client_socket.close()
server_socket.close() 




