'use strict '
 var controllerModule=  angular.module('DPSController', [])

     controllerModule.controller('HomeController',['$scope','HomeService', "$location" , function($scope,HomeService,$location) {
          $scope.home=function (){
             HomeService.home().then(function(value) {
                       console.log(value.data);
                       $scope.message=value.data.message;
                        $scope.error="hahahha";
                        $location.path("home");
                   }, function(reason) {
                       console.log("error occured");
                       $scope.error="hahahha";
                   }, function(value) {
                       console.log("no callback");
                   });
                    }
                       $scope.validate=function (){
                                 HomeService.validate($scope.value).then(function(value) {
                                 $scope.result=value.data;
                                            $location.path("validate");
                                       }, function(reason) {
                                           console.log("error occured");
                                       }, function(value) {
                                           console.log("no callback");
                                       });
                                        }
      }]);
