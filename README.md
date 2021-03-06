![parabow](https://github.com/jakebildy/parabow/blob/master/assets/parabow_logo.png?raw=true)

Parabow uses a voice recognition release system to allow paraplegic athletes to compete in para-archery without having to use their mouth/neck as a release mechanism.

Code comprises two sections - 

1. The companion app to allow the bow to connect to the phone with Bluetooth, which also does the speech-to-text analysis
2. The source code for the actual release mechanism

# About
Paralympic archery, known as para archery by the International Paralympic Committee, has a long history, being present at the first Paralympics in Rome in 1960.

For individuals lacking an arm, the most common release mechanism involves pulling the drawstring back with one’s teeth. This however presents significant difficulties especially regarding the strain it poses to the individual’s neck. Draw-weight must be sacrificed for comfortability, or vice versa.

By using voice command to fire the bow, these issues can be resolved, enabling para archers to engage in the sport more fully, and closer to the standard version of the sport. This will be integrated into a mechanical release mechanism, using tissue simulant to accurately simulate the force of the finger against the drawstring. The user will be capable of the same degree of motion someone lacking disabilities would possess, as their method of aiming would be identical to standard archery. Instead of having to aim and hold onto the string itself, this will be held mechanically, and released by a specific keyword, or phrase.


# Technical Details

 **Frontend**: Java (Android Studio)
 
 **Release Mechanism Infrastructure**: Raspberry Pi running Python
 
 Communication between the Raspberry Pi and Android app is done via Bluetooth, using RFCOMM due to its simplicity.
 
 Speech to text is done via Google Cloud Speech API, as already incorporated into Android 

# Video Demonstration
(Dramatic facial expressions not included)

[![Watch the video](http://img.youtube.com/vi/qQZ-nHc6CSI/0.jpg)](https://youtu.be/qQZ-nHc6CSI)

# ASCII Art of Prof. Dickinson 
                                                                                                                                                                                                                                                                
                                                                                                                                                                                                        
                                               @@@@@@@@@@@@@@@@                                         
                                          @@@@@@@@@@@@@@@@@@@@@@@@@                                   
                                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                              
                                @@@@@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                         
                              @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                      
                             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                   
                            @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                
                          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@              
                         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@             
                        @@@@@@@@@@@@@@@@@@@@@@@@@             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@           
                       @@@@@@@@@@@@@@@                                   @@@@@@@@@@@@@@@@@@@@         
                       @@@@@@@@@@@                                         @@@@@@@@@@@@@@@@@@@@       
                      @@@@                                                    @@@@@@@@@@@@@@@@@       
                     @@@                                                        @@@@@@@@@@@@@@@       
                    @@@                                                          @@@@@@@@@@@@@@       
                   @@@                                                            @@@@@@@@@@@@@       
                   @                                                              @@@@@@@@@@@@@       
                  @@                                                               @@@@@@@@@@@@       
                 @@                                                                @@@@@@@@@@@@       
                 @@                                                                 @@@@@@@@@@@@@@@   
                @@                                                                   @@@@@@@@@@@@@@   
                @                                                                      @@@@@@@@@@@@   
                @                                                                       @@@@@@@@@@@   
              @@@                                                                       @@@@@@@@@@@   
              @@@                                                                      @   @@@@@@@@   
               @                                                                              @@@@@   
                                                                                              @@@@@   
                                                                                              @@@@    
                @@@@     @@@@@@@@    @                                              @@@@@@ @@@@@@@    
      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @@@@@@@@@@@@@@@                          @@@@@@@@@@@@@    
    @@@@@@    @@@@@@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@@@@@                 @@@@@@@@@@@@@   
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@        @@@@@@@@@@@@@   
    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   
     @@       @@@@@@@@@@@@@@@@@@@@@@@    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   
      @       @@@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    
      @@       @@@@@@@@@@@@@@@@@@@@@     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@@@@@@@      @@
      @@       @@@@@@@@@@@@@@@@@@@@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         @@@@@@@       @@
      @@           @@@@@@@@@@@@@@@@        @@@@  @@@@@@@@@@@@@@@@@        @@            @@@@         @
       @@@             @@@@@@@@@@@@         @@@@         @@  @@@          @@             @@          @
         @@@@@@          @@@@@@@@@          @@@@@                         @@                          
           @@@@@@@@@@@@@@@@@@@@@@@            @@@@@@@                   @@@                   @@      
            @@  @@@@@@@@@@@@@@@@@                 @@@@@@@@@@@@@@@@@@@@@@@                     @@@@    
                     @@@@@@@@@@@                     @@@@@@@@@@@@@@@                           @@     
                     @@@@@@@@@@                      @@@@@@@@                                    @    
                    @@@@@@@@@@@@                      @@@@                                            
            @@    @@@@@@@@@@@@@@@                     @@@@@                                           
           @@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@@         @@@@@@@                                        
           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @@@@@@@@@                                      
           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@@@@@@@@@                                     
           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@        @@@@@@@@@@        @                           
          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@          @@@@@@@@@        @                           
          @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         @@@@@@@@@@@        @@                          
           @@@@@@@@@@@@@@@@@@@@@@@                     @@@@@@@@@@@                                    
            @@@  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                                    
            @@@@   @@@@@@@@@@       @@@           @@@@@@@@@@@@@@@@                                    
             @@@    @@@@@@@@                         @@@@@@@@@@@@                                     
             @@@     @@@@@@@@                        @@@@@   @@                                       
              @@@   @@@@@@@@@@@@                             @                                        
              @@@@ @@@@@@@@@@@@@@@@@@@    @@@@                                                        
               @@@@@@@@@@@@@@@                                                                        
                @@@@@@@@@@@@@@@@                                           @@@                        
                @@@@@@@@@@@@@@@@@@                                         @@                         
                 @@@@@@@@@@@@@@@@@@@@@@                                   @@@@                        
                 @@@@@@@@@@@@@@@@@@@@@@@                                @@@@@@                        
                 @@@@@@@ @@@@@@@@@@@@@@                                 @@@@@@                        
                  @@@@@    @@@@@@@@@@@                                @@@@@@                          
                   @@@@@   @      @@                                 @@@@                             
                    @@@@@@@@                                                                          
                     @@@@@@@                                                                          
                      @@@@@                                       @                                   
                      @@@@@@                                                                          
                      @@@@@@@@@@                   @@@@@    @@@                     @                 
                    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                     @@@@              
                   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                      @@@@@             
                  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                         @@@@             
                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                            @@@@@            
                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                              @@@@    
