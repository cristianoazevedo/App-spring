	//Definindo o módulo	
	modulo = angular.module("App",[]);
	
	modulo.service('serviceIndex', ['$http', function($http){
		this.setAluno = function (aluno){
			return $http.post("/aluno?nome="+aluno.nome+'&ra='+aluno.ra);
		}
	}]);
	
	modulo.controller("IndexController", ['$scope', 'serviceIndex', function($scope, serviceIndex){
		
		$scope.alunos = [];
		
		$scope.cadastrar = function(aluno){
			serviceIndex.setAluno(aluno).success(function(data){
				$scope.alunos.push(data);				
			}).error(function(data){
				console.log('Não funfou!');
			})
		}
		
	}]);


	
	