# SPRING ADVANCED

##프로젝트 설명
기존의 코드를 solid을 고려하여 리팩토링

early Return -> 기존 코드의 순서를 변경하여 이미 가입되어있는 회원인 경우 비밀번호 인코딩 전 Return하도록 구현
if-else -> else를 다른 if문으로 빼 가독성과 유지보수성 고려
n+1문제 -> entitygraph를 이용해 n+1문제 해결
