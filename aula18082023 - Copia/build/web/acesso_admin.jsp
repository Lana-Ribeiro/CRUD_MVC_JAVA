<%-- 
    Document   : acesso_admin
    Created on : 19/10/2023, 22:11:42
    Author     : lanac
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Home</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="configura.css">
    </head>
    <body>
        
        <!-- Header -->
        <header>
            <h1>SENAC</h1>
            <p>Bem Vinda ${nome}</p>

</header>
        
        <!-- Navegação do SubMenu Departamento -->
        <nav>
            <div class="menu">
                <button class="botao">Departamentos</button>
                <div class="submenu">
                    <a href="caddep.html">Cadastro</a>
                    <a href="condep.html">Consulta</a>
                    <a href="altdep.html">Alteração</a>
                    <a href="excdep.html">Exclusão</a>
                    <a href="ControleDepartamento?flag=list_dep" target="centro">Listagem</a>                    
                </div>
            </div>
            
            
            <!-- Navegação do SubMenu Funcionários -->
         <div class="menu">
                <button class="botao">Funcionários</button>
                <div class="submenu">
                    <a href="cadfun.html"  target="centro">Cadastro</a>
                    <a href="confun.html" target="centro">Consulta</a>
                    <a href="altfun.html" target="centro">Alteração</a>
                    <a href="excfun.html" target="centro">Exclusão</a>
                    <a href="lisfun.html" target="centro">Listagem</a>                    
                </div>
            </div>
            
            
              <!-- Navegação do SubMenu Usuários -->
            <div class="menu">
                <button class="botao">Usuários</button>
                <div class="submenu">
                    <a href="cadusu.html" target="centro">Cadastro</a>
                    <a href="conusu.html" target="centro">Consulta</a>
                    <a href="altusu.html" target="centro">Alteração</a>
                    <a href="excusu.html" target="centro">Exclusão</a>
                    <a href="lisusu.html" target="_blank">Listagem</a>                    
                </div>
            </div>            
        </nav>
        
        
        <!-- Main chamando a pagina inicial -->
        <main>
            <iframe src="inicial.html" name="centro"></iframe>
        </main>
        
        
        
          <!-- Rodapé -->
        <footer>
            <p>
                <a href="http://jigsaw.w3.org/css-validator/check/referer">
                    <img style="border:0;width:88px;height:31px"
                         src="http://jigsaw.w3.org/css-validator/images/vcss"
                         alt="CSS válido!" />
                </a>
            </p>
        </footer>
    </body>
</html>

