package com.sim.credito

class PrestamoDocumentosController {

     def listaDocumentos() {
		
		 def path = new File("${System.getProperty('user.home')}/Documents/tuNomina/imagenes/${params.id}")
		 
        render(view: "documentos", model: [clavePrestamo: params.id, path: path])
    }
}
