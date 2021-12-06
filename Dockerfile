FROM tomcat:7

# RUN rm -rf /usr/local/tomcat/webapps/ROOT

ENV TZ=Asia/Seoul

COPY ./target/passtest-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
