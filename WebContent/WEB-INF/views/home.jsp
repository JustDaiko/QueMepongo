<%@ include file="/WEB-INF/views/include.jsp" %>
<html>
<head>
  <meta charset="utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Que Me Pongo</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!--Bootstrap-->
  <link rel="stylesheet" href="resources/css/bootstrap.min.css">
  <link rel="stylesheet" href="resources/css/bootstrap-grid.min.css">
  <link rel="stylesheet" href="resources/css/bootstrap-reboot.min.css">
  <!--Material icons-->
  <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
  <link rel="stylesheet" href="resources/css/materialdesignicons.min.css">
  <!--Material lite-->
  <link rel="stylesheet" href="resources/css/material.min.css">
  <!--Weather icons-->
  <link rel="stylesheet" href="resources/css/weather-icons.css">
  <!--Stylesheet-->
  <link rel="stylesheet" type="text/css" media="screen" href="resources/css/index.css" />
</head>
<body>
  <!--Location-->
  <h5 id="location"><span class="mdi mdi-map-marker"></span> <c:out value="${model.weather.name}"/> </h5>
  <!--Settings wheel-->
  <i class="material-icons" id="settings-wheel">settings</i>
  <!--Settings panel-->
  <div class="settings-panel off">
    <h4 class="mdl-typography--title">
      Preferencias
    </h4>
    <hr>
    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
      <input class="mdl-textfield__input" type="number" id="minima">
      <label class="mdl-textfield__label" for="minima">Mínima</label>
    </div>
    <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
        <input class="mdl-textfield__input" type="number" id="maxima">
        <label class="mdl-textfield__label" for="maxima">Máxima</label>
    </div>
    <button class="mdl-button mdl-js-button mdl-button--raised" id="svae-settings-button">
        Guardar
    </button>
  </div>

  <!--Card-->
  <div class="forecast-card mdl-card">
    <!--Title and background-->
    <div class="mdl-card__title">
      <!--Forecast widget-->
      <div class="col-xl-4 today-forecast">
        <div>
          <div class="rainy weather-icon">
            <div class="rainy__cloud"></div>
            <div class="rainy__rain"></div>
          </div>
        </div>
        <h1> 2333 </h1>
        <ul class="mdl-list">
            <li class="mdl-list__item">
              <span class="mdl-list__item-primary-content">
                <i class="mdi mdi-chart-bubble mdl-list__item-icon"></i>
                50% humedad
              </span>
            </li>
            <li class="mdl-list__item">
              <span class="mdl-list__item-primary-content">
                <i class="mdi mdi-weather-windy mdl-list__item-icon"></i>
                24 km/h
            </span>
            </li>
            <li class="mdl-list__item">
              <span class="mdl-list__item-primary-content">
                <i class="mdi mdi-weather-rainy mdl-list__item-icon"></i>
                86% de probabilidad
              </span>
            </li>
          </ul>
      </div>

      <!--Forecast suggestion-->
      <div class="col-xl-8 suggestion">
        <h2>Lorem ipsum dolor sit amet consectetur adipisicing elit.</h2>
      </div>
    </div>

    <!--Extended forecast-->
    <div class="mdl-card__supporting-text extended-forecast-title">
      Pronóstico extendido
    </div>
    <div class="mdl-card__actions mdl-card--border extended-forecast">
      <div class="container-fluid row">
        <div class="col-lg-4 extended-forecast-item">
            <h3>Lunes</h3>
            <div class="sunny"></div>
            <h3>24°C</h3>
        </div>
        <div class="col-lg-4 extended-forecast-item">
            <h3>Martes</h3>
            <div class="partly_cloudy">
              <div class="partly_cloudy__sun"></div>
              <div class="partly_cloudy__cloud"></div>
            </div>
            <h3>24°C</h3>
        </div>
        <div class="col-lg-4 extended-forecast-item">
            <h3>Miércoles</h3>
            <div class="thundery">
              <div class="thundery__cloud"></div>
              <div class="thundery__rain"></div>
            </div>
            <h3>24°C</h3>
        </div>
      </div>
    </div>
  </div>

  <!--jQuery-->
  <script src="resources/js/jquery.min.js"></script>
  <!--Bootstrap-->
  <script src="resources/js/bootstrap.min.js"></script>
  <!--Material lite-->
  <script src="resources/js/material.min.js"></script>
  <!--Javascript-->
  <script src="resources/js/index.js"></script>
</body>
</html>

<!--
  <div class="sunny"></div>
<h2>Sunny</h2>

<div class="partly_cloudy">
	<div class="partly_cloudy__sun"></div>
	<div class="partly_cloudy__cloud"></div>
</div>
<h2>Partly cloudy</h2>

<div class="cloudy"></div>
<h2>Cloudy</h2>

<div class="rainy">
	<div class="rainy__cloud"></div>
	<div class="rainy__rain"></div>
</div>
<h2>Rainy</h2>

<div class="thundery">
	<div class="thundery__cloud"></div>
	<div class="thundery__rain"></div>
</div>
<h2>Thundery</h2>

<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
    <br>
    	
    <br>
  </body>
  <script src="resources/js/bootstrap.min.js"></script>
</html>
-->