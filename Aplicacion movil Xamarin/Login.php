<?php 
session_start();
include('conexion.php');

class Usuarios
{
   public $Email;
   public $Contrasena;
   public $Respuesta;
}
    $datosEntra = file_get_contents("php://input");
    $datosdecode = json_decode($datosEntra);
    $Email = $datosdecode->Email;
    $Contrasena = $datosdecode->Contrasena;
    $objetoJson = new Usuarios();

    $sql = "Select * from usuarios where correo = '$Email' and contrasena = '$Contrasena'";
    $datos= mysqli_query($conexion,$sql) or die("Error de SQL");
   
   

    if(mysqli_num_rows($datos)==1)
    {
        $objetoJson->Respuesta="Ok";
       echo json_encode($objetoJson);
    }
    else
    {
        $objetoJson->Respuesta="error";
        echo json_encode($objetoJson);        
    }
    mysqli_free_result($datos);
    mysqli_close($conexion);
?>