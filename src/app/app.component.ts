import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ListaordenadoresComponent } from './listaordenadores/listaordenadores.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,ListaordenadoresComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'miapp';
}
