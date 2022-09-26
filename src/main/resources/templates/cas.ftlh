[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Datum a čas</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
    <link rel="icon" type="image/png" href="/images/favicon.png">
</head>
<body>
<div class="container">
    <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
        <ul class="nav nav-pills">
            <li class="nav-item"><a href="/" class="nav-link">Domů</a></li>
            <li class="nav-item"><a href="/datum" class="nav-link">Datum</a></li>
            <!-- Třída „active“ se přesunula na tlačítko „Čas“, aby bylo na stránce modré. -->
            <li class="nav-item"><a href="/cas" class="nav-link active">Čas</a></li>
        </ul>
    </header>
    <div class="px-4 py-5 my-5 text-center">
        <!-- Do obsahu elementi <h1> chceme dosadit atribut „cas“ z modelu. -->
        <h1 class="display-1 fw-bold">${cas}</h1>
    </div>
</div>
</body>
</html>
