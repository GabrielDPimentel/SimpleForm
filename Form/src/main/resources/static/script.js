const form = document.getElementById("formCadastro");

form.addEventListener("submit", async (event) => {
  event.preventDefault();

  const formData = new FormData(form);

  try {
    const response = await fetch("/aprovados", {
      method: "POST",
      body: formData
    });

    if (response.ok) {
      alert("Cadastro realizado com sucesso!");
      form.reset();
    } else {
      alert("Erro ao enviar os dados.");
    }
  } catch (error) {
    alert("Erro de conexão com o servidor.");
    console.error(error);
  }
});
