import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FormService } from '../services/form.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrl: './form.component.css'
})
export class FormComponent {

  vehicleForm!: FormGroup;

  constructor(private fb: FormBuilder, private formService: FormService) {
    this.vehicleForm = this.fb.group({
      matricule: ['', Validators.required],
      vehicleUsage: ['', Validators.required],
      priceNeuf: ['', [Validators.required, Validators.min(15000)]],
      priceVenale: ['', [Validators.required, Validators.min(15000)]],
      responsabiliteCivile: [false],
      defenseRecours: [false],
      volVehicule: [false],
      incendieVehicule: [false],
      brisGlace: [false],
      personnesTransporte: [false],
      securiteConducteur: [false],
      assistance: [false],
      dommagesCollision: [false],
      dommagesVehicule: [false],
      cin: ['', Validators.required],
      nom: ['', Validators.required],
      prenom: ['', Validators.required],
      dateNaissance: ['', Validators.required],
      tel: ['', [Validators.required, Validators.pattern('[0-9]{8}')]],
      adresse: ['', Validators.required],
    });
  }

  onSubmit() {
    if (this.vehicleForm.valid) {
      this.formService.createVehicleInfo(this.vehicleForm.value as any)
        .subscribe(response => {
          console.log('Vehicle info saved', response);
        });
    }
  }
}
