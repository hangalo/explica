<%-- 
    Document   : estudante
    Created on : 17-mar-2016, 11.03.42
    Author     : praveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Marcar explicação</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Bootstrap -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="js/jquery-1.12.1.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2 style="text-align: center">Marcar explicação</h2>
            <form class="form-horizontal" role="form">
                
                <div class="form-group">
                    <label class="control-label col-sm-2" for="explicacao">Solicitação:</label>
                    <div class="col-sm-10">

                        <select name="explicacao" class="form-control" id="explicacao">
                            <option>1</option>
                            <option>1</option>
                        </select>


                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="data">Data:</label>
                    <div class="col-sm-10">
                        <input type="date" class="form-control" id="data"  name="data"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="hora">Hora:</label>
                    <div class="col-sm-10">
                        <input type="time" class="form-control" id="hora"  name="hora" />
                    </div>
                </div>

                 <div class="form-group">
                    <label class="control-label col-sm-2" for="professor">Professor:</label>
                    <div class="col-sm-10">

                        <select name="professor" class="form-control" id="professor">
                            <option>1</option>
                            <option>1</option>
                        </select>


                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-sm-2" for="casa">Casa:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" id="casa" name="casa" placeholder="Escreva o numero da casa">
                    </div>
                </div>


                <div class="form-group">
                    <label class="control-label col-sm-2" for="rua">Rua:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" id="rua" name="rua" placeholder="Escreva o numero da rua">
                    </div>
                </div>


                <div class="form-group">
                    <label class="control-label col-sm-2" for="bairro">Bairro:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" id="bairro" name="bairro" placeholder="Escreva o nome do bairro">
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="sexo">Municipio:</label>
                    <div class="col-sm-10">

                        <select name="cbo_municipio" class="form-control" id="cbo_municipio">
                            <option>Chibia</option>
                            <option>Chicomba</option>
                        </select>


                    </div>
                </div>


                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary btn-lg">Marcar Explicação</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>
