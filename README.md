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
    <img src="src/main/resources/static/스크린샷 2024-07-01 1801541.png">
  </div>
</details>

     * 장바구니에 담은 아이스크림의 총 예상 금액이 표시됨
     
<details><summary><b>토핑 중복 추가 기능</b></summary>
  <div>
    <img src="src/main/resources/static/스크린샷 2024-07-01 1801542.png">
  </div>
</details>

     * 같은 토핑을 여러번 추가할 수 있음

<details><summary><b>아이스크림 조합 갯수 추가 기능</b></summary>
  <div>
    <img src="src/main/resources/static/스크린샷 2024-07-01 1801543.png">
  </div>
</details>

     * 동일한 아이스크림과 토핑 조합을 여러 개 추가할 수 있음

<details><summary><b>주문 완료 페이</b></summary>
  <div>
    <img src="src/main/resources/static/스크린샷 2024-07-01 1801543.png">
  </div>
</details>

     * 동일한 아이스크림과 토핑 조합을 여러 개 추가할 수 있음









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










