const mongoose = require('mongoose');
const Schema = mongoose.Schema;

let Film = new Schema({
  nome: {
    type: String
  },
  nota: {
    type: String
  },
  descricao: {
    type: String
  }
  
},{
    collection: 'Film'
});

module.exports = mongoose.model('Film', Film);