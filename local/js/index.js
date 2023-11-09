const banner = document.getElementById("banner");
const bannerRandomButton = document.getElementById("bannerRandomButton");
const bannerPrevButton = document.getElementById("bannerPrevButton");
const bannerNextButton = document.getElementById("bannerNextButton");
const page = document.getElementById("page");

const bannerColorAry = ["tomato", "orange", "yellow"];
let slideIndex = 0;

/**   랜덤 배너 배경색 변경 */
function onChangeRandomBannerColor(e) {
  const randomNumber = Math.floor(Math.random() * bannerColorAry.length);
  slideIndex = randomNumber;
  banner.style.backgroundColor = bannerColorAry[randomNumber];
  showPageNumber();
}

/**   이전 배너 배경색으로 변경 */
function onChangePrevBannerColor(e) {
  if (slideIndex === 0) {
    slideIndex = bannerColorAry.length - 1;
    banner.style.backgroundColor = bannerColorAry[slideIndex];
    showPageNumber();
    return;
  }
  slideIndex--;
  banner.style.backgroundColor = bannerColorAry[slideIndex];
  showPageNumber();
}

/**   다음 배너 배경색으로 변경*/
function onChangeNextBannerColor(e) {
  if (slideIndex === bannerColorAry.length - 1) {
    slideIndex = 0;
    banner.style.backgroundColor = bannerColorAry[slideIndex];
    showPageNumber();
    return;
  }
  slideIndex++;
  banner.style.backgroundColor = bannerColorAry[slideIndex];
  showPageNumber();
}

function showPageNumber() {
  page.innerText = slideIndex + "번째 배경색 입니다.";
}

bannerRandomButton.addEventListener("click", onChangeRandomBannerColor);
bannerPrevButton.addEventListener("click", onChangePrevBannerColor);
bannerNextButton.addEventListener("click", onChangeNextBannerColor);
