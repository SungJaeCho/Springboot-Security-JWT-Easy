# Springboot-Security-JWT-Easy
Springboot-Security-JWT-Easy

JWT = Json WEB Token

왜 사용하고 어디서 사용하는지?


1. 세션의 문제점
- 서버가 여러개 로드밸런싱 시 하나의 메모리 공유서버를 사용해야함 (Ex:Redis)

2.TCP(신뢰성), UDP(신뢰성X)
- 통신: OSI 7계층 
(
응용계층 : 사진, 비밀번호 전송
,프리젠테이션 : 압축, 암호화
,세션계층 : 인증 체크 (상대방 컴퓨터가 켜져있는지, 접근이 가능한지 체크)
,트랜스포트 : TCP/UDP 
,네트워크 : IP
위는 WAN // 아래는 LAN
,데이터링크 : 내부 컴퓨터 찾음
,물리 : 케이블
) ->순으로 이동
- 물리에서 전송해서 물-데-네-트-세-프-응으로 다시 올라감
