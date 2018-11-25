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
        <div class="logged-in-preferences">
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
            <input class="mdl-textfield__input" type="number" id="minima">
            <label class="mdl-textfield__label" for="minima">Siento calor desde los...</label>
            <div class="mdl-tooltip" data-mdl-for="minima">
              Temperatura desde la que creo empieza a ser caluroso
            </div>
          </div>
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
              <input class="mdl-textfield__input" type="number" id="maxima">
              <label class="mdl-textfield__label" for="maxima">Siento frio debajo de los...</label>
          </div>
          <div class="mdl-tooltip" data-mdl-for="maxima">
              Temperatura debajo de la cual creo que hace frío
          </div>
          <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="paraguas">
            <span class="mdl-checkbox__label">Paraguas</span>
            <input type="checkbox" id="paraguas" class="mdl-checkbox__input">
          </label>
          <label class="mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect" for="protector">
              <span class="mdl-checkbox__label">Protector solar</span>
              <input type="checkbox" id="protector" class="mdl-checkbox__input">
          </label>
          <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--colored" id="save-settings-button">
              Guardar
          </button>
          <div class="account">
            <h6 class="username">nombredeusuario</h6>
            <h6 class="logout">Salir</h6>
          </div>
        </div>
    <!--
        <div class="log-in-form">
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
              <input class="mdl-textfield__input" type="text" id="username">
              <label class="mdl-textfield__label" for="username">Nombre de usuario</label>
          </div>
          <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
              <input class="mdl-textfield__input" type="password" id="password">
              <label class="mdl-textfield__label" for="password">Contraseña</label>
          </div>
          <button class="mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--colored" id="login-button">
              Ingresar
          </button>
        </div>-->
    </div>
	
  <!--Card-->
  <div class="forecast-card mdl-card">
    <!--Title and background-->
    <div class="mdl-card__title">
      <!--Forecast widget-->
      <div class="col-xl-4 today-forecast">
        <div>
          <div class="weather-icon"></div>
        </div>
        <h1> <c:out value="${model.weather.main.temp}"/>°C </h1>
        <ul class="mdl-list">
            <li class="mdl-list__item">
              <span class="mdl-list__item-primary-content">
                <i class="mdi mdi-chart-bubble mdl-list__item-icon"></i>
                <c:out value="${model.weather.main.humidity}"/>% humedad
              </span>
            </li>
            <li class="mdl-list__item">
              <span class="mdl-list__item-primary-content">
                <i class="mdi mdi-weather-windy mdl-list__item-icon"></i>
                <c:out value="${model.weather.wind.speed}"/> km/h
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
            <h3><c:out value= "${model.forecast.valoresSeteadosPorMi[7]}"/> </h3>
            <div class="sunny"></div>
            <h3> <c:out value ="${model.forecast.list[7].main.temp}"/>°C</h3>
        </div>
        <div class="col-lg-4 extended-forecast-item">
            <h3><c:out value= "${model.forecast.valoresSeteadosPorMi[15]}"/></h3>
            <div class="partly_cloudy">
              <div class="partly_cloudy__sun"></div>
              <div class="partly_cloudy__cloud"></div>
            </div>
            <h3><c:out value ="${model.forecast.list[15].main.temp}"/>°C</h3>
        </div>
        <div class="col-lg-4 extended-forecast-item">
            <h3><c:out value= "${model.forecast.valoresSeteadosPorMi[23]}"/></h3>
            <div class="thundery">
              <div class="thundery__cloud"></div>
              <div class="thundery__rain"></div>
            </div>
            <h3><c:out value ="${model.forecast.list[23].main.temp}"/>°C</h3>
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
  <script>
    $('document').ready(function(){

      var todayForecast;

      function setWeatherIcon(element, id){

        switch(id.substring(0, 1)){
          case '3':
          case '5':
            todayForecast = 'rainy';
            element.append('<div class="rainy__cloud"></div>');
            element.append('<div class="rainy__rain"></div>')
            break;
          case '2':
            todayForecast = 'thundery';
            element.append('<div class="thundery__cloud"></div>');
            element.append('<div class="thundery__rain"></div>');
            break;
          case '8':
            if(id == '800'){
              todayForecast = 'sunny';
            }else if(id == '801' || id == '802'){
              todayForecast = 'partly_cloudy';
              element.append('<div class="partly_cloudy__sun"></div>');
              element.append('<div class="partly_cloudy__cloud"></div>');
            }else if(id == '803' || id == '804'){
              todayForecast = 'cloudy';
            }
            break;
          default:
            todayForecast = 'partly_cloudy';
            element.append('<div class="partly_cloudy__sun"></div>');
            element.append('<div class="partly_cloudy__cloud"></div>');
            break;
        }
        
        element.addClass(todayForecast);
      }

      function setBackgroundBlurImage(src){
        $('body').css('background-image', src);
      }

      function setBackgroundWeatherImage(src){
        $('.forecast-card .mdl-card__title').css('background-image', src);
      }

      var weatherIcon = $('.weather-icon');
      var extendedWeatherIcon1 = $('#extended-weather-icon-1');
      var extendedWeatherIcon2 = $('#extended-weather-icon-2');
      var extendedWeatherIcon3 = $('#extended-weather-icon-3');

      setWeatherIcon(weatherIcon, "<c:out value="${model.weather.weather[0].id}"/>");
      setWeatherIcon(extendedWeatherIcon1, "");
      setWeatherIcon(extendedWeatherIcon2, "");
      setWeatherIcon(extendedWeatherIcon3, "");

      // setBackgroundBlurImage("url()");
      // setBackgroundWeatherImage("url()")

    });

  </script>
  <script src="resources/js/index.js"></script>
</body>
</html>