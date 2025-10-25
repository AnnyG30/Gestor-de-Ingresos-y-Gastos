document.addEventListener("DOMContentLoaded", function() {
  const form = document.getElementById("form");

  form.addEventListener("submit", async function(e) {
    e.preventDefault();

    const nombre = document.getElementById("nombre").value;
    const correo = document.getElementById("correo").value;


    const data = { nombre, correo };

    try {
      const response = await fetch("http://localhost:4000/registro", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify(data)
      });

     if (response.ok) {
       Swal.fire({
         title: "¡Éxito!",
         text: "La operación se realizó correctamente.",
         icon: "success"
       });
     } else {
       Swal.fire({
         icon: "error",
         title: "Oops...",
         text: "Algo salió mal.",
         footer: '<a href="#">¿Por qué ocurrió este error?</a>'
       });
     }

    } catch (error) {
      console.error("Error:", error);
      alert("⚠️ No se pudo conectar con el servidor");
    }
  });
});
