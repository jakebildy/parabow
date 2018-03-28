#Developed by Jake Bildy, 2018


import RPi.GPIO as GPIO
import time 
import os
import bluetooth

server_socket = BluetoothSocket( RFCOMM )
server_socket.bind(("",PORT_ANY))
server_socket.listen(1)

client_socket,address = server_socket.accept()
print ("Connected to " + address + " lmaoo")

while 1:
	data = client_socket.recv(1024)
	if data == "fire" :
		os.system("omxplayer -o local firing.wav")
	
client_socket.close()
server_socket.close() 




