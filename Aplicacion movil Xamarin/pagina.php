<?php 
session_start();
include('conexion.php');
?>
<!DOCTYPE  html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html lang="es" dir="ltr">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <tilte></title> 
 <link rel="stylesheet" href="css/bootstrap.min.css"> 
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"> type="text/javascript"></script>

<script>
$(document).ready(function(){
  $("#mes").on('change',function(e){
    $("#contenido").load('pagina.php?mesActual='+$('#mes').val());
});
  $("#btnResumen").on('click',function(e){
    $("#contenido").load('resumenpagina.php?mesActual='+$('#mes').val());
});
});
</script>
<style>
  div.container {
      width: 95%;
      max-width: 960px;
      margin: 0 auto;
      }
      img{
      width: 85vw;
      height: 70vw;
    }
  
  .titulo-chiquito{
    color:black
  }

</style>  
</head>
<body>
<div id=contenido class="divPanel page-content">

<?php
  $miFecha=date_default_timezone_set('UTC');
  if(empty($_REQUEST['mesActual']))
  {
    if(empty($_SESSION['mesActual']))
    {
        $fecha=strftime("%Y-%m");
        $_SESSION['mesActual']=$fecha;
        $mesN=explode("-",$fecha);
        $_SESSION['mesN']=$mesN[1];
        $_SESSION['anioN']=$mesN[0];
    }
  }
  else
  {
      $_SESSION['mesActual']=$_REQUEST['mesActual'];
      $fecha=$_REQUEST['mesActual'];
      $mesN=explode("-",$fecha);
      $_SESSION['mesN']=$mesN[1];
      $_SESSION['anioN']=$mesN[0];
  }
 $fecha=$_SESSION['mesActual'];
 setlocale(LC_TIME,"es_MX.UTF-8");
 setlocale(LC_TIME, 'spanish');

$mesNuevo=$_SESSION['mesN'];
$anioNuevo=$_SESSION['anioN'];



$sql="Select id,titulo,contenido,DATE_FORMAT(fecha,'%d - %b - %Y') AS fecha,imagen,ganador from carreras 
where Publicar = 'Si' AND MONTH(fechaPubli)='$mesNuevo' AND YEAR(fechaPubli)='$anioNuevo' order by fechaPubli desc";
 $datos= mysqli_query($conexion,$sql) or die("Error de SQL");
?>

<table border=0 class="table" cellpadding="10">
<tr>
<td>
Consulta por mes:<br/> &nbsp<input type="month" id="mes" name="mes" step="1" min="2013-12" value=<?php echo $fecha; ?> >
</td>
<td aling="right">
<br/>
<input type="button" id="btnResumen" value="Ver resumen" class="btn-info" />
</td>
</tr>
</table>
<?php
$vacio = mysqli_fetch_array($datos);
if(empty($vacio['titulo']))
{
  echo "<center><font color='red'><b>No hay carreras en este mes</b></font></center>";
}
$datos=mysqli_query($conexion,$sql) or die("Error de SQL");
echo "<table border=0 cellpadding='20' class='table-responsive'>";
while($reg=mysqli_fetch_array($datos)){
echo "<tr>";
$titulo = mb_strtoupper($reg['titulo'],'UTF-8');
echo "<td><b><font color='green' size='4'>$titulo</font></b><br/>";
echo "Fecha de la carrera: ".$reg['fecha']."</td>";
echo "</tr>";
?>
<?php
if($reg['imagen']!==''){
  echo "<tr>";
  echo "<td><div>";
?>
<img src="data:image/png;base64,<?php echo base64_encode($reg['imagen']);?>" class = "img"> 
</div>
</td>
</tr>
<?php
}
echo "<td align=justify>".$reg['contenido']."<br/></td>";
echo "</tr>";
}
echo "</table>";
mysqli_free_result($datos);
mysqli_close($conexion);
?>
</div>
</body>