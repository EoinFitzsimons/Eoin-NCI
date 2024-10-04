var heroes = {
              "squadName": "Superhero squad",
              "homeTown": "Metro City",
              "formed": 2016,
              "secretBase": "Supertower",
              "active": true,
              "members": [
                {
                  "name": "Molecule Man",
                  "age": 29,
                  "secretIdentity": "Dan Jukes",
                  "powers": [
                    "Radiation resistance",
                    "Turning tiny",
                    "Radiation blast"
                  ]
                },
                {
                  "name": "Madame Uppercut",
                  "age": 39,
                  "secretIdentity": "Jane Wilson",
                  "powers": [
                    "Million tonne punch",
                    "Damage resistance",
                    "Superhuman reflexes"
                  ]
                },
                {
                  "name": "Eternal Flame",
                  "age": 1000000,
                  "secretIdentity": "Unknown",
                  "powers": [
                    "Immortality",
                    "Heat Immunity",
                    "Inferno",
                    "Teleportation",
                    "Interdimensional travel"
                  ]
                }
              ]
            };

// Age of the Molecule Man
var age = document.getElementById("age");
age.innerHTML = heroes.members[0].age;

// Super Powers of Madame Uppercut
var powersTargetElement = document.getElementById("powers");
var powers = heroes.members[1].powers;

var str = "";
for (iCount = 0; iCount < powers.length; iCount += 1 ) {
  str += "<li>" + powers[iCount] + "</li>";
}

powersTargetElement.innerHTML = "<ul>" + str + "</ul>" ;

// Table of members
var membersTargetElement = document.getElementById("members");
var members = heroes.members;

for (iCount = 0; iCount < members.length; iCount += 1 ) {
  var row = document.createElement("tr");

  var nameTargetElement = document.createElement("td");
  nameTargetElement.innerHTML = members[iCount].name;
  row.appendChild(nameTargetElement);

  var ageTargetElement = document.createElement("td");
  ageTargetElement.innerHTML = members[iCount].age;
  row.appendChild(ageTargetElement);

  var identityTargetElement = document.createElement("td");
  identityTargetElement.innerHTML = members[iCount].secretIdentity;
  row.appendChild(identityTargetElement);

  var powersTargetElement = document.createElement("td");
  var str = "";
  for (jCount = 0; jCount < members[iCount].powers.length; jCount += 1) {
    str += members[iCount].powers[jCount];
    if (iCount !== (members[iCount].powers.length - 1)) {
      str += "; ";
    }
  }
  powersTargetElement.innerHTML = str;
  row.appendChild(powersTargetElement);

  membersTargetElement.appendChild(row);
}