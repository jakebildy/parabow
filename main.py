#Developed by Jake Bildy, 2018

import requests
import RPi.GPIO as GPIO
import time 
import pygame



r = requests.get('https://google.ca')

#print(r.text)


pygame.mixer.init()
pygame.mixer.music.load("firing.wav")
pygame.mixer.music.play()

while pygame.mixer.music.get_busy() == True:
	continue 




