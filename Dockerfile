FROM bellsoft/liberica-runtime-container:jre-slim-glibc

MAINTAINER "Amit Yadav<amit.yadav@50hertz.in>"
#RUN apk --no-cache add netcat-openbsd
COPY chain.pem chain.pem
RUN keytool -trustcacerts -keystore $JAVA_HOME/lib/security/cacerts -storepass changeit -noprompt -importcert -file chain.pem
COPY target/HEA_UI-1.3-SNAPSHOT.war HEA_UI-1.3-SNAPSHOT.war 

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-Duser.timezone=IST","-jar","/HEA_UI-1.3-SNAPSHOT.war"]