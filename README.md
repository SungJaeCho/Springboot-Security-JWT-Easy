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

3. CIA[기밀성(중간에 뺏기지말아야함), 무결성(변경되지않아야함), 가용성(원하는문서에 접근을 제대로할수있는지)]
-이걸 지켜야 보안을 유지할수 있음(쉽지않음..)
-키 전달 문제
-문서가 누구로부터 왔는지

4. RSA(암호화)
-A가 개인키로 잠궈서 문서를 B에게 보낼시 B는 A의 공개키로 열어봄으로서 해당문서가 A에서 왔음을 알수 있음(전자서명)
-A가 B의 공개키로 문서를 암호화하여 B에게 보내면 B가 해당 문서를 B의 개인키로 열어봄으로서 문서의 CIA를 보존한채 받을수 있음. (암호화)
-최종적으로 A에서 B에게 문서 전달시 B의 공개키로 암호화된 문서를 A의 개인키로 한번더 감싸서 보냄으로서 암호화와 인증을 둘다 해결할 수 있음.
