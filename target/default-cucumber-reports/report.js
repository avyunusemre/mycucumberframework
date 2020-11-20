$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/fhcregister.feature");
formatter.feature({
  "name": "FhcTrip Registiration",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fhcregistiration"
    }
  ]
});
formatter.scenario({
  "name": "fhcTrip registiration test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fhcregistiration"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "kullanici fhctrip sayfasindadir",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_fhctrip_sayfasindadir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici creat a new account butonuna tiklar",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_creat_a_new_account_butonuna_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici username girer \"Yunusemre\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_username_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici password girer \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_password_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici email girer \"techproedtest@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_email_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici Fullname girer \"Yunus Emre\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_Fullname_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici phone number girer \"05431234567\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_phone_number_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici social security number girer \"321219384757\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_social_security_number_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici driving licence girer \"98762\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_driving_licence_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici country secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_country_secer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici state secer",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_state_secer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici address girer \"Goethe Str. 9\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_address_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici working sector girer \"IT\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_working_sector_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici birth date girer \"21.12.1970\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_birth_date_girer(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "kullanici Save butonuna tiklar",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.FhcRegistirationStepDef.kullanici_Save_butonuna_tiklar()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});