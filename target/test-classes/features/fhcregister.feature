@fhcregistiration
Feature: FhcTrip Registiration

  Scenario: fhcTrip registiration test
    Given kullanici fhctrip sayfasindadir
    And kullanici creat a new account butonuna tiklar
    And kullanici username girer "Yunusemre"
    And kullanici password girer "12345"
    And kullanici email girer "techproedtest@gmail.com"
    And kullanici Fullname girer "Yunus Emre"
    And kullanici phone number girer "05431234567"
    And kullanici social security number girer "321219384757"
    And kullanici driving licence girer "98762"
    And kullanici country secer
    And kullanici state secer
    And kullanici address girer "Goethe Str. 9"
    And kullanici working sector girer "IT"
    And kullanici birth date girer "21.12.1970"
    Then kullanici Save butonuna tiklar
