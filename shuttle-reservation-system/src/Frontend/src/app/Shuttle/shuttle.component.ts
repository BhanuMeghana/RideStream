import { Component, OnInit } from '@angular/core';
import { ShuttleService } from './shuttle.service';

@Component({
  selector: 'app-shuttle',
  templateUrl: './shuttle.component.html',
  styleUrls: ['./shuttle.component.css']
})
export class ShuttleComponent implements OnInit {
  shuttles: any[] = [];

  constructor(private shuttleService: ShuttleService) {}

  ngOnInit(): void {
    this.getShuttles();
  }

  getShuttles(): void {
    this.shuttleService.getShuttles().subscribe((data) => {
      this.shuttles = data;
    });
  }
}
