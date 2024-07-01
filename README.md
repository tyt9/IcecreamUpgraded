# icecream 2.0
**아이스크림 주문 포스기 2.0** 입니다.<br><br><br>

### 개발 기간
* 2024.01.22 ~ 2024.01.30 (8일)<br><br>

### 개발 환경
* Java 11
* **프레임워크** : Spring Boot(2.7.17)
* **데이터베이스** : mysql - MyBatis
* **프론트** : thymeleaf, javascript, jQuery<br><br>

### 달라진 점
<details><summary><b>예상 금액 표시 기능</b></summary>
  <div>
    <img src="icecream/WebContent/스크린샷 2024-06-12 145442.png">
  </div>
</details>

     * 아이스크림 한 종류와 토핑(0개 또는 여러개)을 선택하고 담기 버튼을 누르면 장바구니에 추가됨
     
<details><summary><b>주문하기</b></summary>
  <div>
    <img src="icecream/WebContent/스크린샷 2024-06-12 150051.png">
  </div>
</details>

     * 장바구니에 담긴 아이스크림들이 주문 결정됨

<details><summary><b>이전 주문 내역</b></summary>
  <div>
    <img src="icecream/WebContent/스크린샷 2024-06-12 150413.png">
  </div>
</details>

     * 주문 상세 내역이 최신순으로 정렬됨

<details><summary><b>관리</b></summary>
  <div>
    <img src="icecream/WebContent/스크린샷 2024-06-12 150640.png">
  </div>
</details>

     * 아이스크림과 토핑 종류 추가




* 예상 금액 표시 기능
* 같은 토핑을 여러번 추가할 수 있음
* 동일한 아이스크림과 토핑 조합을 여러 개 추가할 수 있음<br><br>



























# Icecream 2.0
이전에 만든 아이스크림 주문 포스기의 업그레이드 버전<br><br>

이전에 아이스크림 가게 만들 때 아쉬운 점이 많았다.<br>
1. 예상금액 표시 안되는 점
2. 토핑 여러번 추가 안되는 점
3. 같은 조합으로 여러개 추가가 안되는 점
4. 재고 관리 기능<br>

등이 아쉬워서 고치려고 보니 소스가 너무 복잡했다.<br>
그래서 고민하다 생각해낸 것이 문자열로 만들지 말고 자바스크립트 객체로 만들어서 넘기면 훨씬 간단할 것 같았다.<br>
그러려면 소스를 전부 갈아엎어야 하는데...그럴바에야 새로 만드는게 빠를 것 같았다.<br>
그래서 새로 만들기로 했다<br>
간단하게 만들기 위해서 Spring Boot와 thymeleaf를 사용했다.<br><br><br>
일단 오늘까지의 업데이트 상황 : 
1. 예상금액 표시 완료
2. 토핑 여러번 추가 가능
3. 아이스크림 같은 조합으로 여러개 구매 가능

아래서 자세히 설명하겠다.<br><br>


아래는 기능설명 입니다.

![스크린샷 2024-06-19 165214](https://github.com/tyt9/IcecreamUpgraded/assets/143326223/1b714722-3d49-4004-90fd-dd48c4d5da98)<br>

첫 화면 입니다.<br>
*아이스크림은 한번에 한 종류만 선택할 수 있습니다. 그에 대한 토핑은 여러가지를 선택할 수 있습니다.<br><br><br>

① 담기 버튼 : 아이스크림과 토핑을 선택한 후 누르면 장바구니에 담깁니다.
![스크린샷 2024-06-19 164410](https://github.com/tyt9/IcecreamUpgraded/assets/143326223/c53f57fd-2da5-4a6b-92ff-49936ae515e8)<br><br>
**아이스크림 1.0과 달라진 점 : 빨간색과 파란색 네모 부분*<br>
토핑 각각을 **여러번 추가**할 수 있게 되었고, 그 아이스크림 조합의 **갯수를 늘릴 수 있습니다**.<br>
주문하기 전에 **예상 금액**도 보여줍니다.<br><br>

② 주문하기 버튼 : 장바구니에 담긴 아이스크림들이 주문 결정 됩니다.
![스크린샷 2024-06-19 164444](https://github.com/tyt9/IcecreamUpgraded/assets/143326223/dbded6d4-c6e1-4ba2-a0dd-e060827b6c3c)<br>
**아이스크림 1.0과 달라진 점 : 아이스크림 조합 갯수와 토핑 갯수가 표시됩니다*.<br><br>

③ 초기화 버튼 : 장바구니에 담긴 모든 상품이 초기화 됩니다.<br><br>

④ 이전 주문 내역 버튼 : 이전에 주문했던 내역이 뜹니다.<br>

![스크린샷 2024-06-19 164509](https://github.com/tyt9/IcecreamUpgraded/assets/143326223/808c082c-02a0-4215-8f50-6746397203a6)<br><br>
**아이스크림 1.0과 달라진 점 : 삭제 버튼이 없어졌습니다*.<br><br><br>

앞으로 더 추가할 예정인 기능 : 재고관리 기능<br>
주문할 때 마다 상품의 재고가 줄어들고, 상품의 재고가 없으면 주문이 불가능하게 만들 것 입니다.<br><br><br>

ERD 참고하세요.(1.0버전이랑 똑같습니다.)<br>
![IceCreamERD](https://github.com/tyt9/IcecreamUpgraded/assets/143326223/c364a6a0-ce6e-45d5-a1ea-a17c4733f5e1)










