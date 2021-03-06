# Spring SampleApplication

## sampleProject01
![sampleProject01](image/screen01.PNG)
## Spring + Maven + JPA + Thymeleaf + Mysql

### pom.xml
2.3.3.RELEASE  
java 11  
spring-boot-starter-web  
spring-boot-starter-thymeleaf  
spring-boot-starter-data-jpa  
mysql-connector-java  
org.projectlombok  
spring-boot-starter-test  
junit-vintage-engine  
org.webjars bootstrap4.5.2 jquery3.4.1  
#### 機能
CRUD  
SPA  
結果表示のレイアウトを見やすく　背景を奇数と偶数で分ける  
削除ボタン非活性、活性　チェックボタン押下時に削除実行  

#### 概要
sampleProject02Application.javaがエントリーポイントとなる。  
ソリューション構成は基本的にエントリーポイント直下に追加していくのが望ましい。  

resources/static直下にcssファイルとjsファイル追加  

application.propertiesにDB設定を記述  
```
?serverTimezone=JST (文字化け対策)
```

アノテーションが便利  
DI注入  
```
@AutoWired

// 上記と同じ意味
private final MembersRepository repository;

	SampleController(MembersRepository repository) {
		this.repository = repository;
	}
    
// DI注入が楽
```

JPAのアノテーション  
```
@Entity // Modelに記述でデータがbindingされる
@Repository// Repository登録
```

Lombock  
```
@Data

getter setter constructor 等を自動で生成してくれる。
```

コントローラー  
```
@Controller("/")
@GetMapping("/")
@PostMapping("/delete")
// Mapping
```

リクエストパラメーター  
```
@RequestParamでリクエストパラメーターを受け取る。

@PostMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		repository.deleteById(id);
		return "redirect:/";
	}

@ModelAttribute
リクエストから送信されたObject"formModel"からMembersクラスにbinding
自動でやってくれる。

@PostMapping("/register")
	public String registerAndUpdate(@ModelAttribute("formModel") Members members) {
		if(members.getId() == null && members.getName() == "") {
			return "redirect:/";
		}
			repository.save(members);
		return "redirect:/";
	}
```

Thymeleaf構文  
```
// objectとしてリクエストパラメータを送信できる。
th:object="${formModel}" // object

<form class="w-100" method="post" action="/register "th:object="${formModel}">

th:each="${obj : ${members}" // foreach
th:text="${obj.id}" // 表示 
th:value="${obj.id}" //　value値

```

JPAは簡単なSQLの処理には向いているが複雑になればなるほど難しい。  
JpaRepositoryを継承することで用意されているメソッドを使える  
全件検索　更新　削除　などなど。。  

## sampleProject02
## Spring +Gradle + MyBatis + Thymeleaf + MySql

### build.gradle
2.3.3.RELEASE  
java 14  
'org.springframework.boot:spring-boot-starter-thymeleaf'  
'org.springframework.boot:spring-boot-starter-web'  
'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.3'  
'org.projectlombok:lombok'  
'org.webjars:jquery:3.5.1'  
'org.webjars:bootstrap:4.5.2'  
'mysql:mysql-connector-java'  
'org.projectlombok:lombok'  
'org.springframework.boot:spring-boot-starter-test'  
'org.junit.vintage','junit-vintage-engine'  


## sampleProject03
## Spring +Gradle + MyBatis + Thymeleaf + MySql

### build.gradle
2.3.4.RELEASE  
java 11  
'org.springframework.boot:spring-boot-starter-thymeleaf'  
'org.springframework.boot:spring-boot-starter-web'  
'org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.3'  
'org.projectlombok:lombok'  
'org.webjars:jquery:3.5.1'  
'org.webjars:bootstrap:4.5.2'  
'mysql:mysql-connector-java'  
'org.projectlombok:lombok'  
'org.springframework.boot:spring-boot-starter-test'  
'org.junit.vintage','junit-vintage-engine'  

#### 機能
Controller側から受け取ったデータをJavaScriptに送る。
Chart.js　グラフを作成。
[Chart.jsサイト](https://www.chartjs.org/)
共通のlayout

#### 概要
Controller側からJavaScriptへのデータの送り方 

##### sampleController.java
```
model.addAttribute("employees",employeesMapper.FindAll());
model.addAttribute("visit", "訪問回数");
model.addAttribute("construct","契約回数");
```
##### index.html
```
<script th:inline="javascript">
	var employees = [[${employees}]];
	var visit = [[${visit}]];
	var construct = [[${construct}]];
</script>
```

Chart.js 全体的なサイズの変更方法
##### レスポンシブ指定
```
<style>
@media screen and (min-width: 768px) {
  .chart_container {
    width: 640px;
    margin: auto;
  }
}
</style>
```
[レスポンシブの参考サイト](https://obel.hatenablog.jp/entry/20160626/1466937585)

##### layout共通化
```
// layout.html
<section th:fragment="header"> // 共通

// index.html
<div th:replace="com/layout::header"></div> // 固有
```
[共通layoutの参考サイト](https://obel.hatenablog.jp/entry/20160626/1466937585)