# workshop_kotlin


How to install Oracle Java JDK on Ubuntu Linux

Ouvrez le terminal

sudo apt-add-repository ppa:webupd8team/java 
sudo apt-get update 
sudo apt-get install oracle-java8-installer
java -version
clear
sudo gedit /etc/profile

export JAVA_HOME=/usr/lib/jvm/java-8-oracle




How to install Android Studio in Ubuntu Linux

https://developer.android.com/studio/

Ouvrez le terminal dans le dossier bin

sudo chmod 777 -R studio.sh

./studio.sh

Si erreur -> Error:Unable to run mksdcard SDK tool in ubuntu 
              sudo apt-get install lib32z1 lib32ncurses5 lib32bz2-1.0 lib32stdc++6 


