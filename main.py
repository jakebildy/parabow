#Developed by Jake Bildy, 2018


import RPi.GPIO as GPIO
import time 
import os
from bluetooth import *

server_socket = BluetoothSocket( RFCOMM )
server_socket.bind(("",PORT_ANY))
server_socket.listen(1)

uuid = "94f39d29-7d6d-437d-973b-fba39e49d4ee"

advertise_service(server_socket, "ParabowServ2", service_id=uuid,service_classes=[uuid, SERIAL_PORT_CLASS],profiles=[SERIAL_PORT_PROFILE])

print("Preparing to connect")

client_socket,address = server_socket.accept()

print ("Connected lmaoo")

while (True) :	
	data = client_socket.recv(1024)
	if len(data) > 0 :
		print ("firing...")
		os.system("omxplayer -o local firing.wav")
		time.sleep(2)


