<?php 
session_start();
include('conexion.php');
?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="author" content="">
  <tilte></title> 
  
 <link rel="stylesheet" href="css/bootstrap.min.css"> 
 <link href="./constructores.css" rel="stylesheet" type=text/css> 
 </style>  
</head>
<body>
<section class="encabezado">
  <h1 class="titulo">Constructores</h1>
 
</section>  
<br><br>
<?php 
$sql="Select idescuderia,puesto,puntos,escuderia,imagen,nombrec1,nombrec2,carro from escuderias order by puesto";
 $datos= mysqli_query($conexion,$sql) or die("Error de SQL");
 while($reg=mysqli_fetch_array($datos)){
?>
<div class='carta'>
  <div class='cabecera-carta'>
    <div class='posicion'>
     <?php echo $num=$reg['puesto']; ?>
    </div>
    <div class='puntos'>
    <?php echo $num=$reg['puntos']; ?>pts
    </div>

  </div>
  <div class="info-corredor">
    <div class='nombre-carta'>
      <?php echo $num=$reg['escuderia']; ?>
    </div> 
    <figure class="bandera">
      <img src="data:image/png;base64,<?php echo base64_encode($reg['imagen']);?>" class = "foto-bandera"> 
    </figure>
  </div> 
  <div class='escuderia-carta'>
      <div class="nombre-corredor1">
      <?php echo $num=$reg['nombrec1']; ?>
      </div>
      <div class="nombre-corredor2">
      <?php echo $num=$reg['nombrec2']; ?>
      </div>
  </div>
  <div class='presentacion'> 
    <figure class= "foto" >
      <img src="data:image/png;base64,<?php echo base64_encode($reg['carro']);?>" class = "foto-piloto">
    </figure>
    <figure class='fondo'>
    </figure>
  </div>
  <div class="franja">
  </div>
</div>
<div class="espacio">
  <br><br><br>
</div>
 <?php } ?>
</body>