let currentDate = new Date();

let user;
let inputUserBirthday = document.getElementById('inputUserBirthday');
let calculateButton = document.getElementById('calculate');
let result = document.getElementById('result');
calculateButton.addEventListener("click", function(){
    calculateAge(user)});

function createUser(user){
    const userName = document.getElementById('inputUserName').value;
    const birthdayValue = inputUserBirthday.value;
    const components = birthdayValue.split('-');
    const userBirthdayYear = parseInt(components[0]);
    const userBirthdayMonth = parseInt(components[1]) -1;
    const userBirthdayDay = parseInt(components[2]);
    user = new User(userName, new Date(userBirthdayYear, userBirthdayMonth, userBirthdayDay));
    return user;
}

function calculateAge(user){
    user = createUser(user);
    const ageInMiliseconds = currentDate.getTime() - user.birthday.getTime();
    const ageInDays = ageInMiliseconds / (1000 * 60 * 60 * 24);
    const userAge = new Date(0, 0, 0);
    userAge.setDate(userAge.getDate() + ageInDays);
    user.age = userAge;
    result.innerHTML = `${user.name}, su edad es: ${user.age.getFullYear()-1900} años con ${user.age.getMonth()} meses y ${user.age.getDate()} días`;
}

function User(name, birthday){
    this.name = name;
    this.birthday = birthday;
    this.age = null;
}