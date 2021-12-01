const iniciarCadastro = document.querySelector('#cadastrarEmail');
const voltarCadastro = document.querySelector('.botao-voltar');
const formularioInicial = document.querySelector('#primeiraTela');
const formularioSecundario = document.querySelector("#segundaTela");
// const cancelarCadastro = document.getElementById('');

iniciarCadastro.addEventListener('click', () => {
    formularioInicial.classList.toggle("deactivated");
    formularioSecundario.classList.toggle("deactivated");
});

voltarCadastro.addEventListener('click', () => {
    formularioInicial.classList.toggle("deactivated");
    formularioSecundario.classList.toggle("deactivated");
})