var app = angular.module('app', ['ngRoute','DPSController','DPSServices']);

app.config(function($routeProvider) {

$routeProvider.when('/home', {
templateUrl : 'views/home.html',
controller : 'HomeController'
})
.when('/validate', {
  templateUrl : 'views/validate.html',
  controller : 'HomeController'
  });
});