


# 🦏아동 지킴이 서비스 앱

 




<img src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/127e3449-a477-4805-8485-7055a9e1132b" alt="사진" width="750" height="600">
                  



 

## 1. 프로그램 기획
#### *아동안전 지킴이집이란?*

- 학교 주변과 통학로, 공원 주변의 문구점과 편의점, 약국 등을 아동안전지킴이집으로 지정하여
  위험에 처하거나 길을 잃은 아동 임시 보호, 경찰에 인계하는 곳.
  
 ### ① 지역사회문제점 

 ####  1.아동 지킴이집 인지도 부족
 -  아동들이 위급 상황에서 범죄 예방 등의 중요한 역할을 하는 아동안전 지킴이집에 대한 인지도가 낮음.
 -  아동안전 지킴이집을 초등학교에서 교육하는 곳도 있지만 모르는 사람이 더 많다.
 #### 2.실종아동 접수 증가
 -  실종아동 접수 건수가 지속적으로 늘어나고 있다.
 #### 3.꾸준히 일어나는 아동 관련 범죄(유괴, 납치)
 -  아동 유괴, 납치 등의 아동 관련 범죄가 꾸준히 발생하고 있다.




### ② 프로젝트 소개

  
  - **아동안전지킴이집 지도 기능**: 
    - 현재 내 위치 기준으로 주변 아동안전지킴이집 리스트 확인/보여주기
  - **자율방범대 커뮤니티**: 
    - 동네 자율방범대 커뮤니티를 통해 현재 방범 상황 공유
    - 순찰인증 , 매일매일 동선 바꿔가면서 순찰 후에 인증하기
  - **로그인, 회원가입 기능**: 
    - 사용자 회원가입
    - 사용자, 관리자 로그인/로그아웃
    - 관리자용 페이지 구현 (사용자 관리)
  - **안전수칙 메뉴얼**: 
    - 아동 안전지킴이집에 대한 알림
    - 아동 안전지킴이집 행동수칙
    - 아동 및 부모가 알아야 할 안전 행동 수칙
  - **수호천사 리스트**: 
    - 내 주변 아동안전수호천사(아동지킴이들) 리스트를 제공하여 동네 아동 안전 강화
      
 ### ③ 프로젝트 선정 이유(개발 필요성)
- 아동안전지킴이집에 대한 인지도가 낮고, 아동 안전과 관련된 홈페이지가 관리가 잘 되고 있지 않아 아동 범죄와 관련된 제대로 된 홈페이지가 필요하다고 생각되어 프로젝트 기획을 하게 됨.
 


 ## 2. 팀원 소개

 <h1>팀명</h1>

 ![KakaoTalk_Photo_2024-05-21-23-04-18 001](https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/f793542f-dd4e-4185-b866-e8ba69958dc0)

 
 <div align="center">

| **안홍영** | **김민수** | **박세연** | **진윤재** |
| :------: |  :------: |  :------: |  :------: |
| [<img src="https://github.com/2024-literacy-project/2024-literacy-project/assets/82174047/34321251-97e6-4ef1-adfd-059cc4f0066f" height=150 width=150> <br/> @inredzero](https://github.com/inredzero) | [<img src="https://github.com/2024-literacy-project/2024-literacy-project/assets/82174047/e21f081d-d9ee-431a-b8ff-0e963fad3811" height=150 width=150> <br/> @moressangplease](https://github.com/moressangplease) | [<img src="https://github.com/2024-literacy-project/2024-literacy-project/assets/82174047/4a486b99-1b23-4a85-bb09-a29c026e37e1" height=150 width=150> <br/> @se-3-yeon](https://github.com/se-3-yeon) | [<img src="https://github.com/2024-literacy-project/2024-literacy-project/assets/82174047/87154d04-2119-472d-89d9-eb512feff02b" height=150 width=150> <br/> @Realyunjae](https://github.com/Realyunjae) |
| 팀장 | 팀원 | 팀원 | 팀원 | 
| open API(안전지킴이집) 연동<br>카카오 map 연동<br>지도 페이지 구현 |  open API(안전지킴이집) 연동<br>카카오 map 연동<br>지도 페이지 구현  | 회원가입, 로그인 페이지 구현<br>게시판 CRUD 기능 구현<br>DB 설계 | 회원가입, 로그인 페이지 구현<br>게시판 CRUD 기능 구현<br>DB 설계  | 

</div>

<br/>

### Wakanda Forever팀 작업관리


- GitHub issue, 학교에서 대면으로 진행상황 공유
- 매일  짧은 회의를 통해 notion에 회의내용을 기록함.
- notion에 역할 분담,
- 매일 학교에서 짧은 회의를 통해 notion 에 회의내용을 기록함.

#### 개발 기간
-  개발 기간 : 2024-06-04 ~ 2024-06-13
  

## 3.채택한 개발 기술과 브랜치 전략


 ###   ① 개발 환경 
 ###  프로그래밍 언어 및 프레임워크
  

#### Spring boot
-   Spring Boot Java 기반의 오픈 소스 경량 프레임워크로, Spring 프레임워크 위에서 동작
#### thymeleaf
- Thymeleaf는 서버 사이드 자바 템플릿 엔진으로, XML/XHTML/HTML5 컨텐츠를 웹 애플리케이션에서 동적으로 생성하는데 사용.
#### MySQL
-  MySQL을 데이터베이스 관리 시스템으로 사용
#### MyBatis
-  데이터베이스와 객체 간의 자동 매핑 기능을 제공하여, SQL 쿼리 실행 및 결과 매핑
#### CSS 
-  웹 페이지의 레이아웃, 색상, 글꼴 등의 스타일을 정의하는 스타일 시트 언어


### ② 버전 및 이슈관리
  -  Github, Github Issues, Github Project
   <img src="https://img.shields.io/badge/git-F05032?style=for-the-badge&logo=git&logoColor=white">
  
  <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
  

### ③ 협업 툴
 <div align=left>
 <img src="https://img.shields.io/badge/discord-5865F2?style=for-the-badge&logo=discord&logoColor=white"></div> 
 <div align=left> <a href="https://www.notion.so/Find-Dog-2f081d1cdc6c46f0b27c2a591f2be77d?pvs=4">
 <img src="https://img.shields.io/badge/notion-000000?style=for-the-badge&logo=notion&logoColor=white"></div>
 </a><div align=left>
 <img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white"></div>
<div align="left">
    <img src="https://github.com/DBTeamP/DBProject/assets/135615995/470c2391-acbd-48b4-b410-5cd0afb1de96" alt="사진" width="30" height="30"> Chrome Remote Desktop
</div>
<div align="left">
    <img src="https://github.com/DBTeamP/Find-Dog/assets/135615995/5e61746a-f6f2-4912-a31e-ca8b9755d8fe" alt="사진" width="30" height="30"> Google Meet
</div>

###  ④ 브랜치전략
- 각자 맡은 기능에따라 브랜치를 생성하여
- 브랜치명은 feature/기능/(자기 깃허브 닉네임)
- feature/ : 기능단위로 독립적인 개발환경을 위해 사용.




## 4. 유사 프로그램 분석
### ① 안전드림
<div align="left"> <img src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/82174047/b15b597e-df9a-4db1-98d6-58f9e9ec93b3" alt="사진" width="380" height="130">


- 사회적 약자 대상 범죄에 대한 피해 신고 접수와 신속한 구조 활동을 지원하기 위해 경찰청 아동∙여성∙장애인 경찰지원센터에서 만든 홈페이지

#### 특징
- 실종아동, 성범죄, 학교폭력, 가정폭력, 스토킹 등의 범죄를 다룸.
- 피해자 보호, 지원과 관련된 정보 제공
- 지도에서 생활안전시설 검색 가능 (아동안전지킴이집, 노인보호시설, 아동보호시설, 청소년지원시설, 해바라기 센터)
#### 문제점
- 현재 내 주변 아동안전 지킴이집을 찾기 힘들다. 
- 예를 들면, ‘공릉’을 검색했을 때 공릉동에 있는 아동안전 지킴이집이 검색되는 것이 아니라 상호명에 ‘공릉’이 들어가는 가게가 검색된다.
- 공릉역이나 태릉입구역을 검색했을 때 주변에 있는 아동안전 지킴이집을 찾을 수 없다. 

### ② 차별화 전략
- 1. 위치 검색 강화
  - 현재 내 위치 기준으로 주변에 있는 아동안전 지킴이집들을 보여준다. 
  - 주소별 검색 기능 추가
    
- 2. 동네 자율방범대 커뮤니티
  - 동네 방범 상황을 공유하여 더 안전하고 안심 가능한 동네 환경 조성 

- 3. 아동안전수호천사 리스트 제작
  - 내 주변 아동안전수호천사 리스트를 제공하여 동네 아동 안전 강화

     
## 6. DB/프로젝트 구조
### 논리 ERD
![논리](https://github.com/2024-literacy-project/2024-child-protect-project/assets/82174047/267fa14d-6bb7-4fa8-aff7-fe2b1a7c959e)

 ### 물리 ERD
![물리](https://github.com/2024-literacy-project/2024-child-protect-project/assets/82174047/91629ee3-e309-44c2-b723-f3e40f0698a7)

 
 ```
.
├── java
│   └── com
│       └── ohgiraffers
│           └── childprotectproject
│               ├── Application.java
│               ├── angel
│               │   └── Controller
│               │       └── AngelController.java
│               ├── community
│               │   ├── Controller
│               │   │   └── CmuController.java
│               │   ├── DTO
│               │   │   ├── CmuDAO.java
│               │   │   └── CmuDTO.java
│               │   └── Service
│               │       ├── CmuService.java
│               │       └── CmuServiceImpl.java
│               ├── config
│               │   ├── MybatisConfiguration.java
│               │   └── RestTemplateConfig.java
│               ├── main
│               │   └── Controller
│               │       └── MainController.java
│               ├── manual
│               │   └── Controller
│               │       └── ManualController.java
│               ├── map
│               │   ├── DataController.java
│               │   └── MapController.java
│               ├── member
│               │   ├── Controller
│               │   │   └── MemberController.java
│               │   ├── DTO
│               │   │   ├── MemberDAO.java
│               │   │   └── MemberDTO.java
│               │   ├── Service
│               │   │   ├── MemberService.java
│               │   │   └── MemberServiceImpl.java
│               │   └── common
│               │       └── UserRole.java
│               └── test
│                   ├── controller
│                   │   └── TestController.java
│                   ├── model
│                   │   ├── dao
│                   │   │   └── TestDAO.java
│                   │   └── dto
│                   │       ├── ApiResponse.java
│                   │       ├── LocationData.java
│                   │       └── TestDTO.java
│                   └── service
│                       ├── ApiService.java
│                       └── TestService.java
└── resources
    ├── application.properties
    ├── mapper
    │   ├── CmuMapper.xml
    │   ├── MemberMapper.xml
    │   └── TestMapper.xml
    ├── mybatis-config.xml
    ├── static
    │   ├── css
    │   │   ├── angel
    │   │   │   └── angel.css
    │   │   ├── common
    │   │   │   └── header.css
    │   │   ├── community
    │   │   │   ├── add.css
    │   │   │   ├── detail.css
    │   │   │   ├── list.css
    │   │   │   └── update.css
    │   │   ├── main
    │   │   │   └── main.css
    │   │   ├── manual
    │   │   │   └── manual.css
    │   │   ├── map
    │   │   │   └── map.css
    │   │   └── member
    │   │       ├── editList.css
    │   │       ├── login.css
    │   │       ├── register.css
    │   │       └── userList.css
    │   ├── img
    │   │   ├── call.png
    │   │   ├── fingerprint.png
    │   │   ├── guardians.png
    │   │   ├── headerlogo.png
    │   │   └── logo.png
    │   └── index.html
    └── templates
        ├── angel
        │   └── angel.html
        ├── common
        │   ├── aside.html
        │   ├── footer.html
        │   └── header.html
        ├── community
        │   ├── add.html
        │   ├── detail.html
        │   ├── errorPage.html
        │   ├── list.html
        │   └── update.html
        ├── dataView.html
        ├── dataViewForm.html
        ├── main
        │   └── main.html
        ├── manual
        │   └── manual.html
        ├── map
        │   └── map.html
        ├── member
        │   ├── editList.html
        │   ├── errorPage.html
        │   ├── login.html
        │   ├── register.html
        │   └── userList.html
 ```


   
## 7. 페이지별 설명

### ① 메인 화면

- 모든 페이지(아동안전지킴이집 지도, 자율방범대 커뮤니티, 안전수칙 메뉴얼, 수호천사 리스트) 연결
- 로그인, 회원가입 기능
- 지문등록, 실종 아동 신고 알림 배너

 <img width="700" alt="스크린샷 2024-06-03 오후 6 34 30" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/841e559f-e427-46d5-a56a-b28eb7cab931">


### ② 메인 지도 기능(내 주변 아동안전 지킴이집)

- 현재 내 위치 기준으로 주변 아동안전지킴이집 리스트 확인/보여주기
- 내 현재 위치 반경 1km, 2km ,3km, 5km 주변 아동지킴이집 검색
 <img width="972" alt="스크린샷 2024-06-13 오후 11 37 33" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/9ae4d4d1-e08d-42f5-8d0f-4440743ed25a">


### ③ 로그인 & 회원가입 

- 사용자 회원가입 
- 사용자, 관리자 로그인/로그아웃 
- 관리자용 페이지 구현 (사용자 관리)


<img width="400" alt="스크린샷 2024-06-03 오후 6 34 30" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/d73fd48a-a6cb-4fc7-87ec-d2c0db67979b"><br>
<img width="400" alt="스크린샷 2024-06-03 오후 6 34 30" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/87a51bfe-9366-4fe1-bf28-53471500bc5d">

### ④ 자율방범대 커뮤니티

- 매일매일  그 지역 동선 바꿔가면서 순찰 후에 인증하기
- 위험 지역 특징, 순찰 중 위험지역 & 특이사항 간략하게 작성
  
<img width="700" alt="스크린샷 2024-06-03 오후 6 34 30" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/723f6f0f-0042-4f61-a8c0-48409819b72a">

 
### ⑤  안전수칙 메뉴얼

 - 아동 안전지킴이집에 대한 알림
 - 아동 안전지킴이집 행동수칙
 - 아동 및 부모가 알아야 할 안전 행동 수칙
  
<img width="900" alt="스크린샷 2024-06-03 오후 6 34 30" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/186ebed3-13a1-4413-908b-18d6fe563cc0">



### ⑥ 수호천사 리스트 페이지

 - 내 주변 아동안전수호천사(아동지킴이들) 리스트를 제공하여 동네 아동 안전 강화

<img width="700" alt="스크린샷 2024-06-03 오후 6 34 30" src="https://github.com/2024-literacy-project/2024-child-protect-project/assets/129252557/ca87cd23-f4b6-402b-b507-7a728f85b3c0">



 


  



