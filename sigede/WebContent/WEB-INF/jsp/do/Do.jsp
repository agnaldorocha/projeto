<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <title>SIGEDE</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../css/bootstrap.css" rel="stylesheet">
    <script src="../js/.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/jquery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/bootstrap.js"></script>
    <script src="../js/bootstrap-confirmation.js" type="text/javascript"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
          <li><a href="home.jsp"><img src="../img/SIGEDE.png" alt=""></a></li>
        <li class="active"><a href="<c:url value="/audin/audinfiocruz"/>">DEMANDAS</a></li>
        <li>
          <a href="#">RELATÓRIOS </a>
        </li>
        <li><a href="#">SUPORTE</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Perfil</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Sair</a></li>
      </ul>
    </div>
  </div>
</nav>


<div class="container"> 
        <div class="col-md-12">
            <div class="panel with-nav-tabs panel-primary">
                <div class="panel-heading">
                        <ul class="nav nav-tabs">
                            <li><a href="<c:url value="/audin/audinfiocruz"/>">AUDIN/FIOCRUZ</a></li>
                            <li ><a href="<c:url value="/tcu/Tcu"/>">TCU</a></li>
                            <li class="active"><a href="#">DEMAIS ÓRGÃOS</a></li>
                        </ul>
                </div>
                    
                    <div class="tab-content">
                        <div class="tab-pane fade in active" id="tab1primary">
                    <div class="container-fluid">
                       
                            <div class="tab-content"> 
                        <br>
                       <div class="form-group">
                           <a href="cadastrar_do.jsp" class="btn btn-success"><i class="glyphicon glyphicon-plus"></i> CADASTRAR DEMANDA</a>
                           <br>
                       </div>
                
                    </div>
                        <div class="tab-content2">
                           
                    <h4>CONSULTA POR DEMANDAS ORIGINADAS DOS DEMAIS ÓRGÃOS DE CONTROLE</h4>
                
                    </div>
                      <form class="form-inline" role="form">
                                      <!-- Select Basic -->
                        <div class="tab-content3">
                            <div class="control-label">
                                    <label>Assunto</label>
                                </div>
                            <textarea class="textarea" rows="2" ></textarea>
                            <div class="form-group">
                                <div class="control-label">
                                    <label>Tipo</label>
                                </div>
                              <select id="selectbasic" name="selectbasic" class="form-control">
                                <option value=""></option>
                                <option value="Conformidade em Recursos Humanos">Conformidade em Recursos Humanos</option>
                                <option value="Conformidade">Conformidade</option>
                                <option value="Especial e Monitoramento">Especial e Monitoramento</option>
                              </select>
                        </div>
                            
                            <div class="form-group">
                                <div class="control-label">
                            <label>Número</label> 
                                </div>
                              <select id="selectbasic2" name="selectbasic" class="form-control">
                                <option value=""></option>
                                <option value="000">000</option>
                                <option value="001">001</option>
                                <option value="002">002</option>
                                <option value="003">003</option>
                                <option value="004">004</option>
                                <option value="005">005</option>
                                <option value="006">006</option>
                                <option value="007">007</option>
                                <option value="008">008</option>
                                <option value="009">009</option>
                                <option value="010">010</option>
                                <option value="011">011</option>
                                <option value="012">012</option>
                                <option value="013">013</option>
                                <option value="014">014</option>
                                <option value="015">015</option>
                                <option value="016">016</option>
                                <option value="017">017</option>
                                <option value="018">018</option>
                                <option value="019">019</option>
                                <option value="020">020</option>
                                <option value="021">021</option>
                                <option value="022">022</option>
                                <option value="023">023</option>
                                <option value="024">024</option>
                                <option value="025">025</option>
                                <option value="026">026</option>
                                <option value="027">027</option>
                                <option value="028">028</option>
                                <option value="029">029</option>
                                <option value="030">030</option>
                              </select>
                            </div>
                         
                           <div class="form-group">
                                <div class="control-label">
                                    <label>Ano</label> 
                                </div>
                           
                              <select id="selectbasic3" name="selectbasic" class="form-control">
                                <option value=""></option>
                                <option value="2014">2014</option>
                                <option value="2015">2015</option>
                                <option value="2016">2016</option>
                                <option value="2017">2017</option>
                                <option value="2018">2018</option>
                                <option value="2019">2019</option>
                                <option value="2020">2020</option>
                                <option value="2021">2021</option>
                                <option value="2022">2022</option>
                                <option value="2023">2023</option>
                                <option value="2024">2024</option>
                                <option value="2025">2025</option>
                                <option value="2026">2026</option>
                                <option value="2027">2027</option>
                                <option value="2028">2028</option>
                                <option value="2029">2029</option>
                                <option value="2030">2030</option>
                                <option value="2031">2031</option>
                                <option value="2032">2032</option>
                                <option value="2033">2033</option>
                                <option value="2034">2034</option>
                                <option value="2035">2035</option>
                                <option value="2036">2036</option>
                                <option value="2037">2037</option>
                                <option value="2038">2038</option>
                                <option value="2039">2039</option>
                                <option value="2040">2040</option>
                                <option value="2041">2041</option>
                                <option value="2042">2042</option>
                                <option value="2043">2043</option>
                                <option value="2044">2044</option>
                                <option value="2045">2045</option>
                                <option value="2046">2046</option>
                                <option value="2047">2047</option>
                                <option value="2048">2048</option>
                                <option value="2049">2049</option>
                                <option value="2050">2050</option>
                                
                              </select>
                            </div>
                          
                             <div class="form-group">
                                <div class="control-label">
                                    <label>Unidade Auditada</label> 
                                </div>    
                            
                              <select class="form-control">
                                <option value=""></option>
                                <option value="Bio-Manguinhos">Bio-Manguinhos</option>
                                <option value="Farmanguinhos">Farmanguinhos</option>
                                <option value="DIRAD">DIRAD</option>
                                <option value="DIREH">DIREH</option>
                                <option value="DIRAC">DIRAC</option>
                              </select>
                            </div>
                         
                        <div class="form-group">
                                <div class="control-label">
                                    <label>Foco</label>
                                </div>    
                            
                              <select class="form-control">
                                <option value=""></option>
                                <option value="Aposentadoria e Pensão"> Aposentadoria e Pensão</option>
                                <option value="Admissão">Admissão</option>
                                <option value="Afastamentos">Afastamentos</option>
                                <option value="Contratos">Contratos</option>
                              </select>
                            </div>
                           
                            <button type="button" class="btn btn-info"><span class="glyphicon glyphicon-search"></span> BUSCAR</button>
                          
                            <br><br>

                        </div>
                             <br>
                            <div class="container-fluid">       
                                <table class="table table-striped">
                                  <thead>
                                    <tr>
                                      <th>DESCRIÇÃO</th>
                                      <th>UNIDADE AUDITADA</th>
                                      <th>FOCO</th>
                                      <th>ASSUNTO</th>
                                      <th>STATUS</th>
                                      <th>EDITAR</th>
                                    </tr>
                                  </thead>
                                  <tbody>
                                    <tr>
                                      <td>Relatório de Auditoria de Conformidade em Rm nº 02/2014</td>
                                      <td>FAMANGUINHOS</td>
                                      <td>Aposentadoria e Pensão</td>
                                      <td>Expirou o prazo de protocolo de exoneração de vários servidores</td>
                                      <td>ATENDIDO</td>
                                      <td><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></button></td>
                                    </tr>
                                    <tr>
                                      <td>Relatório de Auditoria de Conformidade em Rm nº 02/2014</td>
                                      <td>FAMANGUINHOS</td>
                                      <td>Aposentadoria e Pensão</td>
                                      <td>Expirou o prazo de protocolo de exoneração de vários servidores</td>
                                      <td>ATENDIDO</td>
                                      <td><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></button></td>
                                    </tr>
                                    <tr>
                                      <td>Relatório de Auditoria de Conformidade em Rm nº 02/2014</td>
                                      <td>FAMANGUINHOS</td>
                                      <td>Aposentadoria e Pensão</td>
                                      <td>Expirou o prazo de protocolo de exoneração de vários servidores</td>
                                      <td>ATENDIDO</td>
                                      <td><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></button></td>
                                    </tr>
                                    <tr>
                                      <td>Relatório de Auditoria de Conformidade em Rm nº 02/2014</td>
                                      <td>FAMANGUINHOS</td>
                                      <td>Aposentadoria e Pensão</td>
                                      <td>Expirou o prazo de protocolo de exoneração de vários servidores</td>
                                      <td>ATENDIDO</td>
                                      <td><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></button></td>
                                    </tr>
                                    <tr>
                                      <td>Relatório de Auditoria de Conformidade em Rm nº 02/2014</td>
                                      <td>FAMANGUINHOS</td>
                                      <td>Aposentadoria e Pensão</td>
                                      <td>Expirou o prazo de protocolo de exoneração de vários servidores</td>
                                      <td>ATENDIDO</td>
                                      <td><button type="button" class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></button></td>
                                    </tr>
                                 
                                  </tbody>
                                </table>
                              </div>
                            </form>
                        
</div>
                            </div>
                
                         
                
                    
                      </div>
                </div>
            </div>
        </div>



<script type="text/javascript">

</script>
</body>
</html>
