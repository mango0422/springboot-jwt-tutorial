# spring boot를 이용해서 JWT인증을 구현하기

## JWT

### JWT란?

- RFC 7519 웹 표준으로 지정이 되어있고 JSON 객체를 사용해서 토큰 자체에 정보들을 저장하고 있는 Web Token이라고 정의할 수 있다.
- 특히 JWT를 이용하는 방식은 무겁지 않고 아주 간편하고 쉽게 적용할 수 있어서 사이드 프로젝트를 진행할때는 유용할 수 있다.
- 몇가지 고려해야할 사항만 잘 고려하면 대규모 프로젝트에서도 충분히 사용될 만하다고 한다.

### JWT의 구성

- Header, Payload, Signature 3개의 부분으로 구성되어져 있다.

1.  Header
    - Signature를 해싱하기 위한 알고리즘 정보들이 담겨있다.
2.  Payload
    - 서버와 클라이언트가 주고받는, 시스템에서 실제로 사용될 정보에 대한 내용들을 담고 있다.
3.  Signature
    - 토큰의 유효성 검증을 위한 문자열이다.
    - 이 문자열을 통해 서버에서는 이 토큰이 유효한 토큰인지를 검증할 수 있다.

### JWT 장점

- 중앙의 인증서버, 데이터 스토어에 대한 의존성이 없어 시스템 수평 확장에 유리하다.
- Base64 URL Safe Encoding을 사용하기 때문에 URL, Cookie, Header 어디에든 모두 사용 가능하다. (벙요성)

### JWT 단점

- Payload의 정보가 많아지면 네트워크 사용량 증가(트래픽 크기 커짐), 데이터 설계 고려 필요
- 토큰이 클라이언트에 저장되기 때문에, 서버에서 클라이언트의 토큰을 조작할 수 없음.

간단한 예시를 통해 알아보자