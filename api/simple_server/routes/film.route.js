const express = require('express');
const app = express();
const filmRoutes = express.Router();

let Film = require('../model/Film');

// api to add film
filmRoutes.route('/add').post(function (req, res) {
  let film = new Film(req.body);
  film.save()
  .then(film => {
    res.status(200).json({'status': 'success','mssg': 'film added successfully'});
  })
  .catch(err => {
    res.status(409).send({'status': 'failure','mssg': 'unable to save to database'});
  });
});

// api to get films
filmRoutes.route('/').get(function (req, res) {
  Film.find(function (err, films){
    if(err){
      res.status(400).send({'status': 'failure','mssg': 'Something went wrong'});
    }
    else {
      res.status(200).json({'status': 'success','films': films});
    }
  });
});

// api to get film
filmRoutes.route('/film/:id').get(function (req, res) {
  let id = req.params.id;
  Film.findById(id, function (err, film){
    if(err){
      res.status(400).send({'status': 'failure','mssg': 'Something went wrong'});
    }
    else {
      res.status(200).json({'status': 'success','film': film});
    }
  });
});

// api to update route
filmRoutes.route('/update/:id').put(function (req, res) {
    Film.findById(req.params.id, function(err, film) {
    if (!film){
      res.status(400).send({'status': 'failure','mssg': 'Unable to find data'});
    } else {
        film.nome = req.body.nome;
        film.nota = req.body.nota;
        film.descricao = req.body.descricao;

        film.save().then(business => {
          res.status(200).json({'status': 'success','mssg': 'Update complete'});
      })
    }
  });
});

// api for delete
filmRoutes.route('/delete/:id').delete(function (req, res) {
  Film.findByIdAndRemove({_id: req.params.id}, function(err,){
    if(err){
      res.status(400).send({'status': 'failure','mssg': 'Something went wrong'});
    }
    else {
      res.status(200).json({'status': 'success','mssg': 'Delete successfully'});
    }
  });
});

module.exports = filmRoutes;