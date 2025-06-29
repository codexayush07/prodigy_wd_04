// Scroll to Top Button
const topBtn = document.getElementById("topBtn");

window.onscroll = () => {
  if (document.body.scrollTop > 200 || document.documentElement.scrollTop > 200) {
    topBtn.style.display = "block";
  } else {
    topBtn.style.display = "none";
  }
};

topBtn.onclick = () => {
  window.scrollTo({ top: 0, behavior: "smooth" });
};

console.log("Interactive Portfolio Loaded 🚀");
