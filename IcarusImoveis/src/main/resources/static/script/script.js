//Gerador de ano cadastro do imovel
// Se der BO, fazer pelo Thymeleaf
const seletor2 = document.querySelector('.selector-data');
for (let i = 2021; i > 1900; i--) {
        seletor2.innerHTML += `<option>${i}</option>`;
}


const navbar = document.querySelector('.navBar-container');
const mobile = document.querySelector('.menu');

mobile.addEventListener('click', () => {
        navbar.classList.toggle("active");


})

window.addEventListener("scroll", () => {
        if (window.scrollY != 0) {
                navbar.style.background = "#299689";
        } else {
                navbar.style.background = "none"
        }
});

//----------------------------------------

// DROPDOWN


const dropdown = document.getElementsByClassName('dropdown');
const conteudoDropdown = document.getElementsByClassName('content-dropdown');
const icone = document.getElementsByClassName('close');

for (let i = 0; i < dropdown.length; i++) {
        dropdown[i].addEventListener('click', () => {
                if (parseInt(conteudoDropdown[i].style.height) !== conteudoDropdown[i].scrollHeight) {
                        conteudoDropdown[i].style.height = conteudoDropdown[i].scrollHeight + "px";
                        icone[i].style.transform = "rotate(225deg)";
                        icone[i].style.color = "#299689";

                } else {
                        conteudoDropdown[i].style.height = 0;
                        icone[i].style.transform = "rotate(0deg)";
                        icone[i].style.color = "white";
                }

        });
}

// ---------------------------------------------------

// CARROSSEL

const nextCarrossel = document.getElementsByClassName('btn-carrossel');
const previousCarrossel = document.getElementsByClassName('btn-carrossel-1');
const imagemCarrossel = document.getElementsByClassName('imagems-carrossel');
const bolinha = document.getElementsByClassName('fa-circle');
let contadora = 0;


previousCarrossel[0].addEventListener('click', () => {

        imagemCarrossel[contadora].classList.remove('active');

        bolinha[contadora].style.color = "white";

        contadora = contadora - 1;

        if (contadora < 0) {
                contadora = 4;
        }

        bolinha[contadora].style.color = "rgb(41, 150, 137)";

        imagemCarrossel[contadora].classList.add('active');
        imagemCarrossel[contadora].style.animation = " 1s carrossel-esq";
})

nextCarrossel[0].addEventListener('click', () => {

        imagemCarrossel[contadora].classList.remove('active');

        bolinha[contadora].style.color = "#fff";
        contadora = contadora + 1;

        if (contadora > 4) {
                contadora = 0;
        }

        bolinha[contadora].style.color = "rgb(41, 150, 137)";

        imagemCarrossel[contadora].classList.add('active');
        imagemCarrossel[contadora].style.animation = " 1s carrossel-dir";
})


for (let index = 0; index < imagemCarrossel.length; index++) {
        document.querySelector('.bolinhas').innerHTML += '<i class="fas fa-circle"></i>';
}
bolinha[0].style.color = "rgb(41, 150, 137)";