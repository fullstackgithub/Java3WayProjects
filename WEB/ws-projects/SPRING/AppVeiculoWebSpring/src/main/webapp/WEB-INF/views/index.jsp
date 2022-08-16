<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Garagem</title>
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js.map"></script>
<link rel="stylesheet" href="/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/bootstrap.min.css.map">
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>

	<div class="container mt-3">
		<div id="list-home" class="row">
			<div class="col-4">
				<div class="list-group" id="list-tab" role="tablist">

					<a class="list-group-item list-group-item-action active"
						id="list-java-list" data-toggle="list" href="#java" role="tab"
						aria-controls="java">Java</a> 
						
					<a class="list-group-item list-group-item-action"
						id="list-spring-boot-list" data-toggle="list" href="#spring-boot"
						role="tab" aria-controls="spring-boot">Spring-Boot</a> 
						
					<a class="list-group-item list-group-item-action" id="list-sts-list"
						data-toggle="list" href="#sts" role="tab" aria-controls="sts">Spring
						Tool Suite</a> 
						
						<a class="list-group-item list-group-item-action"
						id="list-angular-list" data-toggle="list" href="#angular"
						role="tab" aria-controls="angular">Angular</a> 
						
						<a
						class="list-group-item list-group-item-action"
						id="list-postgresql-list" data-toggle="list" href="#postgresql"
						role="tab" aria-controls="postgresql">PostgreSQL</a> <a
						class="list-group-item list-group-item-action"
						id="list-hibernate-list" data-toggle="list" href="#hibernate"
						role="tab" aria-controls="hibernate">Hibernate</a> <a
						class="list-group-item list-group-item-action"
						id="list-bootstrap-list" data-toggle="list" href="#bootstrap"
						role="tab" aria-controls="bootstrap">Bootstrap 4</a>
				</div>
			</div>
			<div class="col-8">
				<div class="tab-content" id="nav-tabContent">
					<div class="tab-pane fade show active" id="java" role="tabpanel"
						aria-labelledby="list-java-list">
						<a href="https://www.java.com/pt-BR/">Java</a> is a
						programming language and computing platform first released by Sun
						Microsystems in 1995. It has evolved from humble beginnings to
						power a large share of today’s digital world, by providing the
						reliable platform upon which many services and applications are
						built. New, innovative products and digital services designed for
						the future continue to rely on Java, as well.
					</div>
					<div class="tab-pane fade show active" id="spring-boot"
						role="tabpanel" aria-labelledby="list-spring-boot-list">
						<a href="https://projects.spring.io/spring-boot/">Spring Boot</a>
						makes it easy to create stand-alone, production-grade Spring based
						Applications that you can "just run". We take an opinionated view
						of the Spring platform and third-party libraries so you can get
						started with minimum fuss. Most Spring Boot applications need very
						little Spring configuration.
					</div>
					<div class="tab-pane fade" id="sts" role="tabpanel"
						aria-labelledby="list-sts-list">
						The <a href="https://spring.io/tools">Spring Tool Suite</a> is an
						Eclipse-based development environment that is customized for
						developing Spring applications. It provides a ready-to-use
						environment to implement, debug, run, and deploy your Spring
						applications, including integrations for Pivotal tc Server,
						Pivotal Cloud Foundry, Git, Maven, AspectJ, and more.
					</div>
					<div class="tab-pane fade" id="angular" role="tabpanel"
						aria-labelledby="list-angular-list">
						<a href="https://angular.io/">Angular</a> the modern web
						developer's platform. DEVELOP ACROSS ALL PLATFORMS Learn one way
						to build applications with Angular and reuse your code and
						abilities to build apps for any deployment target. For web, mobile
						web, native mobile and native desktop.
					</div>
					<div class="tab-pane fade" id="postgresql" role="tabpanel"
						aria-labelledby="list-postgresql-list">
						<a href="https://www.postgresql.org/">PostgreSQL</a> is a
						powerful, open source object-relational database system that uses
						and extends the SQL language combined with many features that
						safely store and scale the most complicated data workloads. The
						origins of PostgreSQL date back to 1986 as part of the POSTGRES
						project at the University of California at Berkeley and has more
						than 30 years of active development on the core platform.
					</div>
					<div class="tab-pane fade" id="hibernate" role="tabpanel"
						aria-labelledby="list-hibernate-list">
						<a href="http://hibernate.org/orm/">Hibernate ORM</a> enables
						developers to more easily write applications whose data outlives
						the application process. As an Object/Relational Mapping (ORM)
						framework, Hibernate is concerned with data persistence as it
						applies to relational databases (via JDBC). <br />In addition to
						its own "native" API, Hibernate is also an implementation of the
						Java Persistence API (JPA) specification. As such, it can be
						easily used in any environment supporting JPA including Java SE
						applications, Java EE application servers, Enterprise OSGi
						containers, etc.
					</div>
					<div class="tab-pane fade" id="bootstrap" role="tabpanel"
						aria-labelledby="list-bootstrap-list">
						<a href="https://getbootstrap.com/">Bootstrap</a> is an open
						source toolkit for developing with HTML, CSS, and JS. Quickly
						prototype your ideas or build your entire app with our Sass
						variables and mixins, responsive grid system, extensive prebuilt
						components, and powerful plugins built on jQuery.
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>