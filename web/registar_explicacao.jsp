<%-- 
    Document   : estudante
    Created on : 17-mar-2016, 11.03.42
    Author     : praveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Registar explicação</title>
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
            <h2 style="text-align: center">Registar explicação</h2>
            <form class="form-horizontal" role="form">

                <div class="form-group">
                    <label class="control-label col-sm-2" for="desciplina">Disciplina:</label>
                    <div class="col-sm-10">

                        <select name="desciplina" class="form-control" id="desciplina">
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
                    <label class="control-label col-sm-2" for="estudante">Estudante:</label>
                    <div class="col-sm-10">

                        <select name="estudante" class="form-control" id="estudante">
                            <option>1</option>
                            <option>1</option>
                        </select>


                    </div>
                </div>


                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary btn-lg">Registar Explicação</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>
