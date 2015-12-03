#!/bin/sh

echo "==================================== Build and Deploy ====================================================="

mvn install
rm -rf $CATALINA_HOME/webapps/binadox-chat
cp target/binadox-chat-1.0.war $CATALINA_HOME/webapps/binadox-chat.war
$CATALINA_HOME/bin/catalina.sh run

