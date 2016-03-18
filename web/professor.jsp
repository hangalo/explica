<%-- 
    Document   : estudante
    Created on : 17-mar-2016, 11.03.42
    Author     : praveen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Inscrição do professor</title>
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
            <h2 style="text-align: center">Inscrição do professor</h2>
            <form class="form-horizontal" role="form">
                <div class="form-group">
                    <label class="control-label col-sm-2" for="nome">Nome:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nome"  name="nome" placeholder="Escreva o seu nome"/>
                    </div>
                </div>

                <div class="form-group">
                    <label class="control-label col-sm-2" for="sobrenome">Sobrenome:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="sobrenome"  name="sobrenome" placeholder="Escreva o seu sobrenome"/>
                    </div>
                </div>
                
               
                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Email:</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="email" placeholder="Escreva o seu email">
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-sm-2" for="senha">Senha:</label>
                    <div class="col-sm-10">          
                        <input type="password" class="form-control" id="senha" name="senha" placeholder="Escreva a sua senha">
                    </div>
                </div>
                
                
                   <div class="form-group">
                    <label class="control-label col-sm-2" for="confirma_senha">Confirma Senha:</label>
                    <div class="col-sm-10">          
                        <input type="password" class="form-control" id="confirma_senha" name="confirma_senha" placeholder=" Reescreva a sua senha">
                    </div>
                </div>
                
                <div class="form-group">
                    <label class="control-label col-sm-2" for="escola">Escola:</label>
                    <div class="col-sm-10">          
                        <input type="text" class="form-control" id="escola" name="escola" placeholder="Escreva o nome da sua escola">
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
                        <button type="submit" class="btn btn-primary btn-lg">Inscrever-me</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>
