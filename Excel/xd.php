<?php


   if(isset($_FILES['image'])){
      $errors= array();
      $file_tmp = $_FILES['image']['tmp_name'];
      $file_ext=strtolower(end(explode('.',$_FILES['image']['name'])));
     
      $expensions= array("jpeg","jpg","png");
     
      if(in_array($file_ext,$expensions)=== false){
         $errors[]="extension not allowed, please choose a JPEG or PNG file.";
      }
     
      if($file_size > 2097152) {
         $errors[]='File size must be excately 2 MB';
      }
     
      if(empty($errors)==true) {
         move_uploaded_file($file_tmp,"images/".$file_name);
         echo "Success";
      }else{
         print_r($errors);
      }
   }
?>
<html>
   <body>
     
      <form action = "" method = "POST" enctype = "multipart/form-data">
         <input type = "file" name = "image" />
         <input type = "submit"/>
           
         <ul>
            <li>Sent file: <?php echo $_FILES['image']['name'];  ?>
            <li>File size: <?php echo $_FILES['image']['size'];  ?>
            <li>File type: <?php echo $_FILES['image']['type'] ?>
         </ul>
           
      </form>
     
   </body>
</html>