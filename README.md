## 프로젝트 개요

1. 환경
- 언어: Java 1.8
- 환경: Spring 4, MyBatis, MariaDB 연동, Redis 연동, Tomcat 7
- IDE: Eclipse
- 선행작업: Docker, kubectl 설치

## 배포

1. maven 빌드
```
$ mvn -DskipTests clean package
```

2. docker 빌드
```
$ docker build -t registry_url/default/paastest .
```

3. docker push
```
$ docker push registry_url/default/paastest
```

4. paas 배포
```
$ kubectl apply -f deployment.yml
```

5. 브라우저확인
http://paastest.ingress_url/index.do
http://paastest.ingress_url/session.do

### Redis 설정참고
- RedisConfig.java
- application.properties



