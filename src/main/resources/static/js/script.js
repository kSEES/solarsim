document.addEventListener("DOMContentLoaded", function () {
  const astrodata = document.querySelectorAll(".astro_data");

  astrodata.forEach((planetbutton) => {
    planetbutton.addEventListener("mouseclick", () => {
      fetch(".attributes");
    });
  });
});

function toggleMenu() {
    const menu = document.querySelector('.menu');
    if (menu.style.right === '435px') {
        menu.style.right = '-435px';
    } else {
        menu.style.right = '435px';
    }
  }
