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
    <link rel="stylesheet" type="text/css" media="screen" href="resources/css/profile.css" />
</head>

<body>

    <div class="profile-card container-fluid row">
        <div class="profile-card-title col-lg-12">
            <h1><c:out value="${User.nombre}"/> <c:out value="${User.apellido}"/></h1>
        </div>
        <div class="profile-card-image col-lg-4">
            <div class="cropper">
                <img src="https://i.kinja-img.com/gawker-media/image/upload/s--Tg_qqR3r--/c_scale,f_auto,fl_progressive,q_80,w_800/dnmtn4ksijwyep0xmljk.jpg"
                    alt="profile">
            </div>
            <button class="btn btn-success change-picture-button">Editar</button>
        </div>
        <div class="col-lg-8">
            <ul class="demo-list-control mdl-list">
                <li class="mdl-list__item">
                    <span class="mdl-list__item-primary-content">
                        <b>Nombre</b>
                    </span>
                    <span class="mdl-list__item-secondary-action">
                        <c:out value="${User.nombre}"/>
                    </span>
                </li>
                <li class="mdl-list__item">
                    <span class="mdl-list__item-primary-content">
                        <b>Apellido</b>
                    </span>
                    <span class="mdl-list__item-secondary-action">
                        <c:out value="${User.apellido}"/>
                    </span>
                </li>
                <li class="mdl-list__item">
                    <span class="mdl-list__item-primary-content">
                        <b>Email</b>
                    </span>
                    <span class="mdl-list__item-secondary-action">
                        <c:out value="${User.email}"/>
                    </span>
                </li>
                <li class="mdl-list__item">
                    <span class="mdl-list__item-primary-content">
                        <b>Fecha de nacimiento</b>
                    </span>
                    <span class="mdl-list__item-secondary-action">
                        <c:out value="${User.fechaNacimiento}"/>
                    </span>
                </li>
                <li class="mdl-list__item">
                    <span class="mdl-list__item-primary-content">
                        <b>Úllltima modificación</b>
                    </span>
                    <span class="mdl-list__item-secondary-action">
                        <c:out value="${User.ultimaModificacion}"/>
                    </span>
                </li>
            </ul>
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