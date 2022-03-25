<?php
$server="sql206.epizy.com";
$user="epiz_29012647";
$pass  = "jBuEv3YtfQQCPsD";
$db="epiz_29012647_escuela";

$conexion = new mysqli($server,$user,$pass,$db);
if($conexion->connect_errno){
    die("La conexion ha fallado".$conexion->connect_errno);
} else { echo "";
}
?>