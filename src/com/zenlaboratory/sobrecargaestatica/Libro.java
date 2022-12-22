package com.zenlaboratory.sobrecargaestatica;

public class Libro {
	
	private String titulo;
	private int totalPaginas;
	private int paginaActual;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTotalPaginas() {
		return totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public int getPaginaActual() {
		return paginaActual;
	}
	
	public void setPaginaActual(int paginaActual) {
		this.paginaActual = paginaActual;
	}
	
	public void avanzarPagina() {
		avanzarPagina(1);
	}
	
	public void avanzarCapitulo() {
		avanzarPagina(25);
	}
	// El método queda oculto y solo puede usarse desde la propia clase
	private void avanzarPagina(int paginas) {
		paginaActual = paginaActual + paginas;
	}

}
